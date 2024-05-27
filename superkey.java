class parent
{
    int x=10;
}
class child extends parent
{
    int x=45;
}
class superkey
{
    public static void main(String args[])
    {
        System.out.println(" x ="+x);
        System.out.println(" x ="super.x);
    }
}