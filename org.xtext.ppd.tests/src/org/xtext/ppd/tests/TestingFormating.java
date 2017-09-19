package org.xtext.ppd.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.ppd.PpdStandaloneSetup;
import org.xtext.ppd.format.Formatter;
import org.xtext.ppd.ppd.Document;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.PrintStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


@RunWith(value=XtextRunner.class)


public class TestingFormating {
	
	protected void deleteDirContent(java.io.File dir)
	{
	    // Cleans the output directory
	    File files[] = dir.listFiles();
	    for (int i = 0; files != null && i < files.length; i++)
	    {
	    	if (files[i].isFile())
	    	   files[i].delete();
	    	else
	    	{
	    	   deleteDirContent(files[i]);
	    	   files[i].delete();
	    	}
	    	  
	    }
	}	
	
	static protected class FilterPPDbodyFile implements FilenameFilter 
	{
		@Override
        public boolean accept(File dir, String name) 
        {
           if(name.lastIndexOf('.')>0)
              {
              // get last index for '.' char
              int lastIndex = name.lastIndexOf('.');
              
              // get extension
              String str = name.substring(lastIndex);
              
              // match path name extension
              if (str.equals(".ppd"))
                 {
                 return true;
                 }
              }
           return false;
        }
	};
	
	static ArrayList<File> files = null;
	static HashMap<String, Integer> filesIndexAssociations = null;
	static XtextResourceSet resourceSet = null;
	static Document model = null;
	Resource resource = null;
	private String runninTestName;
	
	enum CR { OK, NOK, NOK2 };
	
	static
		{
		    File indir = new File("utest.indata/");
		    files = new ArrayList<File>(Arrays.asList(indir.listFiles(new FilterPPDbodyFile())));		   
		    
		    filesIndexAssociations = new HashMap<String, Integer>(files.size());
		
		    for (int i = 0; i < files.size(); i++)
		    {
		    filesIndexAssociations.put(files.get(i).getName().replaceAll("\\.ppd", ""), new Integer(i));
		    }
		
			PpdStandaloneSetup.doSetup();
			new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
			resourceSet = new PpdStandaloneSetup().createInjector().getInstance(XtextResourceSet.class);
			resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		}

    CR run(int argAdafileIndex)
    {
    	CR cr = CR.OK;
    	
    	String insourcefilename = files.get(argAdafileIndex).getPath();
    	File insourceFile = new File(insourcefilename);
    	
		File outdir = getOutDir(insourcefilename);
		
		deleteDirContent(outdir);
		
		outdir.mkdirs();
		
		PrintStream execution_errors_log = null;
		
		try {
			execution_errors_log = new PrintStream(new File(outdir, "execution_errors.log"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
    	resource = resourceSet.getResource(URI.createURI(insourcefilename), true);    	

		model = (Document) resource.getContents().get(0);
		
		EList<Resource.Diagnostic> errors = resource.getErrors();	
		
		((XtextResource) resource).getSerializer().serialize(model);
		
		if (!errors.isEmpty())
		{
			File errorsLog = new File(outdir, "syntax_errors.log");
			PrintStream syntax_errors = null;
			try {
				syntax_errors = new PrintStream(errorsLog);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				e.printStackTrace(execution_errors_log);
				cr = CR.NOK2;
				return cr;
			}
			
			for (org.eclipse.emf.ecore.resource.Resource.Diagnostic error : errors)
			{
				System.err.print(error.getLine() + ":");
				System.err.println(error.getMessage());
				syntax_errors.print(error.getLine() + ":");
				syntax_errors.println(error.getMessage());
				cr = CR.NOK;				
			}
		syntax_errors.close();
		}
		if (cr == CR.OK)
		{		   
		   File outsourcefile = new File(outdir, insourceFile.toPath().getFileName().toString());
		   PrintStream out = null;
		   Formatter formatter = new Formatter();
			try {
				out = new PrintStream(outsourcefile);
				StringBuilder output = new StringBuilder((int) insourceFile.length());
				formatter.generate(model, output);
				out.print(output.toString());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				e.printStackTrace(execution_errors_log);
				cr = CR.NOK2;
			}   
		}
		return cr;		
    }

	/**
	 * @param insourcefilename
	 * @return output directory for the test
	 */
	private File getOutDir(String insourcefilename) {
		File outdir = new File(insourcefilename);
		outdir = outdir.getParentFile();
		Path outdirpath = outdir.toPath();
		outdirpath = new File("utest.indata").toPath().relativize(outdirpath);
		String outdirstring = "utest.outdata/" + outdirpath.toString();		
		return new File(outdirstring +  "/" + runninTestName);
	}
    
    CR run(String argTestname)
    {
    	runninTestName = argTestname;
    	return run(filesIndexAssociations.get(argTestname));    	
    }
    
    public @Test void test1()
    {
    CR cr = run("test1");
    assertEquals(CR.OK, cr);
    }

    public @Test void test2()
    {
    CR cr = run("test2");
    assertEquals(CR.OK, cr);
    }    

    public @Test void test3()
    {
    CR cr = run("test3");
    assertEquals(CR.OK, cr);
    }  
}
