class strpal
{
    public static void main(String[] args) {
        
        String str="naman";
        String revstr=" ";

        for(int i<str.length()-1;i>=0;i--);
        {
            revstr=revstr + str.charAt(i);

            System.out.println("Reverse String is : "+revstr);
        }
        if(str.equals(revstr))
            System.out.println("String is plaindrome");
        
        else
            System.out.println("String is not a Palindrome");
    }
}