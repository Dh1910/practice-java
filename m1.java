class m1
{
    static int add(int a, int b)
    {
        return a+b;
    }
    static double add (double x, double y)
    {
        return x+y;
    }
    public static void main(String args[])
    {
        System.out.println("Addition :"+m1.add(10,20));
        System.out.println("Addition :"+m1.add(4.5,7.9));
    }
}