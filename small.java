class small
{
    public static void main(String args[])
    {
        int a[]={3,2,5,1,7};
        int small=a[0];

        for(int i=0;i<a.length;i++)
        {
            if(a[i]<small)
            small=a[i];
        }
        System.out.println("smalll element is :"+small);
    }
}