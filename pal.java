class pal
{
	static int n=343,rev=0,rem,a;
	public static void main(String args[])
	{
		
		
		a=n;
		while(n > 0)
		{
			rem=n % 10;
			rev=(rev * 10) + rem;
			n=n/10;
		}	
		if(rev==a)
		{
			System.out.println("is a palindrome number ");
		}
		else
		{
			System.out.println("is not a palindrome number");
		}
	
	}
}