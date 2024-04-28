import java.util.*;
class a2
{
	public static void main(String[] args)
	{

		Scanner s1=new Scanner(System.in);
		System.out.println("Enter number 1 :");
		int n1=s1.nextInt();
		System.out.println("Enter number 2 :");
		int n2=s1.nextInt();
		
		System.out.println("1.addition :");
		System.out.println("2.Division :");
		System.out.println("3.Multiplication :");
		System.out.println("4.Subtraction :");
		System.out.println("5.Modeulo :");
		
		System.out.println("Choose your number :");
		int c=s1.nextInt();
		
		switch(c)
		{
			case 1:
				int add=n1+n2;
				System.out.println("addition is:"+add);
				break;
			
			case 2:
				int div=n1/n2;
				System.out.println("Division :"+div);
				break;
				
			case 3:
				int mul=n1*n2;
				System.out.println("Multiplication :"+mul);
				break;
				
			case 4:
				int sub=n1-n2;
				System.out.println("subtraction :"+sub);
				break;
				
			case 5:
				int mod=n1%n2;
				System.out.println("Modeulo :"+mod);
				break;
				
		}
	}
}