class A
{
	/*final int i=23;
	public static void main(String args[])
	{
		A obj=new A();
		obj.i=45;
		System.out.println(obj.i);
	}*/
	
	/*int a;
	A(int a)
	{
		this a = a;
	}
	public static void main(String args[])
	{
		A t1=new A(9);
		System.out.println(t1.a);
	}*/
	
	static int a;
	static
	{
		System.out.println("static block is executed ");
	}
	static void display()
	{
		a=10;
		System.out.println("Value of a = "+a);
	}
	public static void main(String args[])
	{
		A.display();
	}
}