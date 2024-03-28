class dh12
{
	public static void main(String args[])
	{
		int x[][]=new int[5][];
		
		x[0]=new int[]{1};
		x[1]=new int[]{1,2};
		x[2]=new int[]{1,2,3};
		x[3]=new int[]{1,2};
		x[4]=new int[]{1};	
		
				
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j] + " ");	
			}
			System.out.println();
		}
	}
}