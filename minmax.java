import java.util.*;
class minmax
{
	public static void main(String args[])
	{
		int x,y,z,min,max;
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter value of x : ");
		x=s1.nextInt();
		
		System.out.println("Enter value of y :");
		y=s1.nextInt();
		
		System.out.println("Enter value of z :");
		z=s1.nextInt();
		
		max=((x>y && x>z) ? x: ((y>z) ? y: z));
		
			System.out.println("Max number :"+max);
			
		min=((x<y && x<z) ? x :((y<z) ? y : z));
		
			System.out.println("Min number :"+min);
		
		
	}
}