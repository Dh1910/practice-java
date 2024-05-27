import java.util.Arrays;
class eqarr
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        int b[]={3,4,6,5,2};

        if(ArrayEqual(a,b))
            System.out.println("Arrays are equal");

        else
            System.out.println("Arrays are not equal");
    }
    public static boolean ArrayEqual(int a[],int b[])
    {
        if(a.length != b.length)
            return false;

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0;i<a.length;i++)
        {
            if(a[i] !=b[i])
                return false;
        }
        return true;
    }
}----------