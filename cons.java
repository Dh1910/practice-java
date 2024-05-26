public class cons {
    cons()
    {
        System.out.println("Default constructor");
    }
    cons(int a )
    {
        System.out.println("parameterize constructor");
        System.out.println("a ="+a);
    }
    cons(cons obj)
    {
        System.out.println("Copy constructor");
    }

    public static void main(String args[])
    {
        cons c1=new cons();
        cons c2=new cons(10);
        cons c3=new cons(c2);
    }
    
}
