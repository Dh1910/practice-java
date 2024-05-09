import java.util.*;
class basic
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Any Number = ");
		int num=sc.nextInt();
		
		System.out.println("Enter Any Year = ");
		int yr=sc.nextInt();
		
		System.out.println("1. even or odd numbers ");
		System.out.println("2. leap year or not ");
		System.out.println("3. negative  or positive numbers ");
		
		System.out.println("Choose any one numbers = ");
		int c=sc.nextInt();
		
		switch (c) {
			case 1:
			if(num % 2 == 0)
			{
				System.out.println("NUMBER IS EVEN");
			}
			else
			{
				System.out.println("NUMBER IS ODD");
			}
			break;
			
			case 2:
			if (yr % 400 == 0) 
			{
				System.out.println("is LEAP YEAR");
			}
			else if (yr % 100 == 0) 
			{
				System.out.println("is not a LEAP YEAR");
			}
			else if (yr % 4 == 0)
			{
				System.out.println("in LEAP YEAR");
			}
			else 
			{
				System.out.println("is not a LEAP YEAR");
			
			}
			break;
			
			case 3:
			if(num >= 0)
			{
				System.out.println("is POSITIVE");
			}
			else if(num <= 0)
			{
				System.out.println("is NEGATIVE");
			}
			else 
			{
				System.out.println("is ZERO");
			}
			break;
		}
	}
}