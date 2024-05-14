import java.util.*;
class alphabet
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a alphabet : ");
		char c=sc.next().charAt(0);
		
		if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
		{
			System.out.println("Character is Alphabet");
			
			if( (c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u') || (c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U'))
			{
				System.out.println("Alphabet is vowels");
			}
			else
			{
				System.out.println("Alphabet is consonant");
			}
		}
		else
		{
			System.out.println("Character is not Alphabet");
		}
	}
}
