class replace
{
    public static void main(String[] args) {
        
        String str="dhyanimarvaniya";
        char c='x';
        int index=11;

        if(index>0 && index<str.length())
        {
            char[] c1=str.toCharArray();
            c1[index]=c;
            String newstr=new String(c1);

            System.out.println("Original String : "+str);
            System.out.println("Updated String : "+newstr);
        }
    }
}