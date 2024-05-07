public class max1
{
	static int a=23,b=45,c=56,d=78;
	public static void main(String args[])
	{
		System.out.println((a>b && a>c && a>d)? a:(b>c && b>d)? b: (c>d)? c : d);
	}
} 
