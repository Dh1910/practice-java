class parent 
{
    void show()
    {
        System.out.println("Parent class method");
    }
}
class child extends parent 
{
    void show()
    {
        super.show();
        System.out.println("child class method");
    }
}
class m2
{
    public static void main(String args[])
    {
        child c1=new child();
        c1.show();
    }
}