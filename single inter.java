class Employee
{
        int salary=20000;

}
class Engineers extends Employee
{
    int benefits=10000;
}
class singleinter
{
    public static void main(String args[])
    {
        Engineers e1=new Engineers();
        System.out.println("Salary = "+e1.salary + "benefits ="+e1.benefits);
    }
}