import java.util.Arrays;
class sortarr
{
    public static void main(String args[])
    {
        int a[]={2,6,8,4,3};

        System.out.println("Original : "+Arrays.toString(a));

        Arrays.sort(a);

        System.out.println("Sorted :"+Arrays.toString(a));
    }
}