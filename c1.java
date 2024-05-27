class parent 
{
    parent()
    {
        System.out.println("Parent class constructor");
    }
}
class child extends parent
{
    child()
    {
        System.out.println("child class constructor");
    }
}
class c1{
    public static void main(String args[])
    {
        child c=new child();
        
    }
}