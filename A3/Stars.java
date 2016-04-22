public class Stars {
	
public int nRow;
public int nCol;

public Stars(int nRow, int nCol)
{
	this.nRow = nRow;
	this.nCol = nCol;
}

public void setRow(int nRow)
{
	this.nRow = nRow;
}

public int getRow()
{
	return nRow;	
}

public void setColumn(int nCol)
{
	this.nCol = nCol;
}

public int getColumn()
{
	return nCol;	
}

public void StarProcedure(int nRow, int nCol)
{
	if (nRow == 1)
{
	for (int j = 0; j < nRow; ++j)
		System.out.print("* ");
	System.out.print("\n");;
}
else
{
	int i = 0;
	while ( i < nRow)
	{
		if ( (i & 1) == 1 )
		{
			for (int j = 0; j < nCol; ++j)
				System.out.print(" *");
			System.out.print("\n");
		}
		else
		{
			for (int j = 0; j < nCol; ++j)
				System.out.print("* ");
			System.out.print("\n");
		}
		++i;
	}
}
		}
}
