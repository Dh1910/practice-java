import java.util.*;
class array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size :");
		int n=sc.nextInt();
		
		System.out.println("Enter array elements:");
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(" arr[" + i + "] = " +arr[i]);
		}
	}
}
