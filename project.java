import java.util.*;
class project
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int myNumber=(int)(Math.random()*100);
		int userNumber=0;

		do
		{	
			System.out.println("Enter number(1-100)");
			userNumber=s1.nextInt();

			if(myNumber==userNumber)
			{
				System.out.println("wouuu......correct");
				break;
			}
			else if(myNumber < userNumber)
			{
				System.out.println("your number is too large");
			}
			else
			{
				System.out.println("your number is too small");
			}
		}while(userNumber > 0);
			System.out.println("your guess no is:");
			System.out.println(myNumber);
		
	}
}	