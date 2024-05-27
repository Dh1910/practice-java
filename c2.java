class parent
{
    int p;
    parent(int a)
    {
        p=a;
    }
}
class child extends parent
{
    int c;
    child(int a,int b)
    {
        super(a);
        c=b;
        System.out.println("p ="+p + "c ="+c);
    }
} 
class c2
{
    public static void main(String args[])
    {
        child c=new child(10,20);

    }
}
