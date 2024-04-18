import java.util.*;
class arm
{
	public static void main(String args[])
	{
		int a,res=0,rem,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		n=sc.nextInt();
		a=n;

		while(a != 0)
		{	
			rem=a%10;
			res += rem*rem*rem;
			a=a/10;
		}
			if(n==res)
			{
				System.out.println("is a Armstrong number");
			}
			else
			{
				System.out.println("is not a Armstrong number");
			}
		
	}	
}