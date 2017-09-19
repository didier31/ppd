package org.xtext.ppd;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.nodemodel.INode;

public class STRINGValueConverter extends DefaultTerminalConverters 
{
    @ValueConverter(rule = "TEXT")
    public IValueConverter<String> TEXT() 
    {
        return textConverterString;	
    }
          
    static TextConverterString textConverterString = new TextConverterString();
    
    static class TextConverterString implements IValueConverter<String>
    {
    	@Override
    	public String toValue(String string, INode node) 
    	{
    		String stringValue = string.substring(1, string.length()-1);
    		return stringValue;
    	}

        public String toString(String value) 
        {
            return '"' + value + '"';
        }
    }
}
