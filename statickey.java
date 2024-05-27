class statickey
{
    static int a;
    static{
        System.out.println("static block is executed");
    }
    static void display()
    {
        a=10;
        System.out.println("Value of a ="+a);
    }
    public static void main(String args[])
    {
        statickey.display();
    }
}