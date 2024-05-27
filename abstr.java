abstract class Bike
{
    abstract void run();
    {
        System.out.println("non-abstract method");
    }

}
class honda extends Bike 
{
    void run()
    {
        System.out.println("abstract method");
    }
	
}
class abstr{
    public static void main(String args[])
    {
        honda h1=new honda();
        h1.run();
        
    }
}