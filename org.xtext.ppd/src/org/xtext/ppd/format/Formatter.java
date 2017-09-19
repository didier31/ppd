/*
 * Current limitation : Folding is proceeded at textual level =>
 *                      it is not possible to fold a group of fields at this time.
 */

package org.xtext.ppd.format;
import java.util.Iterator;
import java.util.Stack;

import org.apache.commons.lang.StringUtils;

import org.eclipse.emf.common.util.EList;
import org.xtext.ppd.ppd.Content;
import org.xtext.ppd.ppd.Document;
import org.xtext.ppd.ppd.Frame;
import org.xtext.ppd.ppd.GB;
import org.xtext.ppd.ppd.HS;
import org.xtext.ppd.ppd.LAB;
import org.xtext.ppd.ppd.RJB;
import org.xtext.ppd.ppd.SimpleContent;
import org.xtext.ppd.ppd.Textual;
import org.xtext.ppd.ppd.VS;

public class Formatter {

protected Stack<Context> contextStack;	
	
public void generate(Document model, StringBuilder formattedText)
{
	contextStack = new Stack<Context>();
	Context context = new Context(0, model.getPaper().getWidth(), model.getPaper().isFolding(), null, false);
	contextStack.push(context);
	EList<Content> contents = model.getContents();
	StringBuilderAdapter formattedTextAdapter = new StringBuilderAdapter(formattedText);
	generate(contents, formattedTextAdapter);
	contextStack.pop();
}

void generate(Content content, StringBuilderAdapter formattedText)
{
VS vs = content.getVs();
Context currentContext = contextStack.peek();
if (vs != null)
{
	generate(vs, formattedText);
	if (currentContext.indentation > 0)
	{
		formattedText.append(StringUtils.repeat(" ", currentContext.indentation));
	}
}	

HS hs = content.getHs();

if (hs != null)
{
	formattedText.append(StringUtils.repeat(" ", hs.getSpc()));
}

SimpleContent simpleContent = content.getSimpleContent();

if (simpleContent instanceof Frame)
{
	generate((Frame) simpleContent, formattedText);
}
else if (simpleContent instanceof Textual)
{	
	generate((Textual) simpleContent, formattedText);
}
}

void debug(String msg)
{
	System.err.print(msg + ": ");
	Context context = contextStack.peek();
	System.err.println("Context = ( ident = " + context.indentation + ", cellPos = " + context.cellPos + ", cellWidth = " + 
	                                context.cellWidth + ", cellLimit = " + context.cellLimit + ")");
}

void generate(Textual text, StringBuilderAdapter formattedText) {
	int paddingL = 0;
	String string = text.getText(); //text.getText().substring(1, text.getText().length()-1);
	int initialPosInline = formattedText.length() - formattedText.toString().lastIndexOf('\n') - 1;

debug("(begin) generate Textual");	
	
Context currentContext = contextStack.peek();

/* Computes position of text */

/* Is it the beginning of a new line ? */
/* yes: apply the indentation */ 
if (initialPosInline == 0)
{
	paddingL += currentContext.indentation;
	initialPosInline += currentContext.indentation;
}

/* Is text in a cell ? 
 * yes: computes right padding of the previous cell
 *      and left padding of the current cell (if right justified) 
 */ 
if (currentContext.cellWidth > 0)
{
	paddingL += currentContext.cellPos - formattedText.length();
	if (currentContext.rightJustified)
	{
		paddingL = currentContext.cellLimit - string.length() - currentContext.cellPos;
	}
}
else
{
	if (currentContext.rightJustified)
	{
		paddingL += currentContext.folding - string.length();
	}
}

/* is padding under folding limit ?
 * yes: Test if it must be folding or not.
 */
if (initialPosInline + paddingL < currentContext.folding)
{
	/*
	 * Is folding strict ?
	 * yes: padding + length of string must be < to folding
	 */
	if (currentContext.strict)
	{
		if (paddingL + text.getText().length() <= currentContext.folding)
		{
			formattedText.append(' ', paddingL).append(string);
			currentContext.cellPos = formattedText.length();
		}
		else
		{
			formattedText.append('\n').append(' ', currentContext.indentation).append(string);
		}
	}
	else
	{
		formattedText.append(' ', paddingL).append(string);
		currentContext.cellPos = formattedText.length();
	}
}
else
{
	formattedText.append('\n').append(' ', currentContext.indentation).append(string);
}
debug("(end) generate Textual");
}

int columnWidth(Content content)
{
	int width = 0;
	if (content.getHs() != null)
		width = content.getHs().getSpc();
	SimpleContent simpleContent = content.getSimpleContent();
	if (simpleContent instanceof Frame)
	{
		width +=  columnWidth((Frame) simpleContent);
	}
	else if (simpleContent instanceof Textual)
	{
		width +=  columnWidth((Textual) simpleContent);
	}
	return width;
}

private int columnWidth(Textual text) {
	int width = text.getText().length(); // text.getText().length() - 2;
	return width;
}

private int columnWidth(Frame frame) {
	int width = 0;
	if (frame instanceof GB)
	{
	   int widths[] = columnWidth((GB) frame);
	   for (int i = 0; i < widths.length; i++)		   
	   {
		   width += widths[i]; 
	   }	  
	}
	else if (frame instanceof LAB)
	{
		width = columnWidth((LAB) frame);
	}
	else if (frame instanceof RJB)
	{
		width = columnWidth((RJB) frame);
	}
	return width;	
}

private int columnWidth(RJB rjb) {
	
	int with = columnWidth(rjb.getContents());
	return with;
}

private int columnWidth(LAB lab) {
	
	int with =  columnWidth(lab.getContents());
    return with;
}

int columnWidth(EList<Content> contents)
{
	Content content = null;
	int width = 0;
	for (Iterator<Content> i = contents.iterator(); i.hasNext(); )
	{
		content = i.next();
		width += columnWidth(content);
	}	
return width;	
}

int[] columnWidth(GB gb)
{
	int widths[] = new int[gb.getColumns()];	
	EList<Content> lcontents = gb.getContents();
	Content content = null;
	int c = 0;
	int width = 0;
	for (Iterator<Content> i = lcontents.iterator(); i.hasNext(); )
	{
		content = i.next();
		width = columnWidth(content);
		if (widths[c] < width) 
			widths[c] = width;
		c++;
		c %= gb.getColumns();
	}
	return widths;
}

void generate(VS vs, StringBuilderAdapter formattedText)
{	
	for (int i = 0; i <= vs.getSpc(); i++)
	{
		formattedText.append('\n');
	}
}

void generate(Frame frame, StringBuilderAdapter formattedText)
{
	if (frame instanceof GB)
		generate((GB) frame, formattedText);
	else if (frame instanceof LAB)
		generate((LAB) frame, formattedText);
	else if (frame instanceof RJB)
		generate((RJB) frame, formattedText);
	// else Frame has been extended with a new subclass that this code should take into account
}

private void generate(RJB rjb, StringBuilderAdapter formattedText) {
	Context context = new Context(contextStack.peek());	
	context.rightJustified = true;	
	contextStack.push(context);	
	generate(rjb.getContents(), formattedText);
	contextStack.pop();
}

private void generate(EList<Content> contents, StringBuilderAdapter formattedText) {
	Content content = null;
	for (Iterator<Content> i = contents.iterator(); i.hasNext(); )
	{
		content = i.next();
		generate(content, formattedText);
	}
}

private void generate(LAB lab, StringBuilderAdapter formattedText) 
{
	Context context = new Context(contextStack.peek());	
	context.indentation = formattedText.length() - formattedText.toString().lastIndexOf('\n') - 1;	
	contextStack.push(context);	
	generate(lab.getContents(), formattedText);	
	contextStack.pop();
}

private void generate(GB gb, StringBuilderAdapter formattedText)
{
	int widths[] = columnWidth(gb); 
	EList<Content> lcontents = gb.getContents();
	Content content = null;
	int c = 0;
	Context context = new Context(contextStack.peek());
	/*
	 * Keeps track of the indentation of the grid
	 */
	context.indentation = formattedText.length() - formattedText.toString().lastIndexOf('\n') - 1;
	context.cellPos = formattedText.length();
	/*
	 * For each cell ....
	 */	
	for (Iterator<Content> i = lcontents.iterator(); i.hasNext(); )
	{
		content = i.next();
		/* Prepares context for inner calls */
		context.cellWidth = widths[c];
		context.cellLimit = context.cellPos + context.cellWidth;
		contextStack.push(new Context(context));	
		generate(content, formattedText);
		contextStack.pop();
		context.cellPos += context.cellWidth;
		/* Changes the column (its index) */
		c++;
		/* Go back to the first column if we was at the last */
		c %= widths.length;
		/* If we return to the first, then new line */
		if (c == 0 && i.hasNext())
		{
			formattedText.append('\n').append(' ', context.indentation);
			context.cellPos = formattedText.length();			
		}
	}	
}


}