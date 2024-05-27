abstract class shape
{
    abstract void Area();

}
class triangle extends shape
{
    int atlitude,base;

    triangle(int a, int b)
    {
        atlitude=a;
        base=b;
    }
    void Area()
    {
        double area=0.5*atlitude*base;
        System.out.println("Area of the triangle:"+area);
    }
}
class rectangle extends shape
{
    int length, width;

    rectangle(int l, int w)
    {
        length=l;
        width=w;
    }
    void Area()
    {
        int area=length * width;
        System.out.println("Area of the Rectangle :"+area); 
    }
}
class circle extends shape
{
    float radius;

    circle(float r)
    {
        radius=r;
    }
    void Area()
    {
		float area=radius;
        System.out.println("Area of the circle :" +area);
    }
}
class i1
{
    public static void main(String args[])
    {
        triangle t1=new triangle(50,10);
        rectangle r1=new rectangle(6,12);
        circle c1=new circle(3);
		t1.Area();
		r1.Area();
		c1.Area();
    }
}