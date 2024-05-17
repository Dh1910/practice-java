import java.util.*;
class revnum
{
	public static void main(String args[])
	{
		int rev=0,rem=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Any number : ");
		int n=sc.nextInt();
		
		while(n != 0)
		{
		
		rem=n % 10;
		rev=rev * 10 + rem;
		n = n / 10;
		
		}
		
		System.out.println("Reverse number is "+rev);
		
	}
}