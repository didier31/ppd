package org.xtext.ppd.format;

import java.util.Vector;

public class Context
{
	Context(int indentation, int folding, boolean strict, Vector<Integer> grid, boolean rightJustified)
	{
		this.indentation = indentation;
		this.folding = folding;
		this.strict = strict;
		this.rightJustified = rightJustified;
		this.cellWidth = 0;
		this.cellPos = 0;
		this.cellLimit = 0;
	}
	
	Context(Context context)
	{
		this.indentation = context.indentation;
		this.folding = context.folding;
		this.strict = context.strict;
		this.rightJustified = context.rightJustified;
		this.cellWidth = context.cellWidth;
		this.cellPos = context.cellPos;
		this.cellLimit = context.cellLimit;
	}	
	
	public int getIndentation()
	{
		return indentation;
	}
	
	int getFolding()
	{
		return folding;
	}
	
	boolean getStrict()
	{
		return strict;
	}
	
	boolean getRightJustified()
	{
		return rightJustified;
	}
	
	int indentation;
	int folding;
	boolean strict;
	boolean rightJustified;
	/* cellWidth is significative when > 0 */
	int cellWidth;
	/* current cell's position in text */
	int cellPos;
	int cellLimit;
}