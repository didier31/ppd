package org.xtext.ppd.format;

public class StringBuilderAdapter {
	
public StringBuilderAdapter(StringBuilder strBuilder) {
		super();
		this.strBuilder = strBuilder;
	}

private StringBuilder strBuilder;

public StringBuilderAdapter append(char c, int n)
{
	for (int i = 0; i < n; i++)
	{
		strBuilder.append(c);
	}
return this;
}

public StringBuilderAdapter append(char c)
{
	strBuilder.append(c);
	return this;
}

public StringBuilderAdapter append(String str)
{
	strBuilder.append(str);
	return this;
}

public int length()
{
	return strBuilder.length();
}

@Override
public String toString()
{
return strBuilder.toString();	
}

}
