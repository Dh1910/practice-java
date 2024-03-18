import java.util.*;
class strfinal
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String 1 : ");
		String first=sc.nextLine();
		
		System.out.println("Enter string 2 :");
		String second=sc.nextLine();
		
		System.out.println("Enetr string 3 :");
		String third=sc.nextLine();
		
		
		System.out.println("1.string length :");
		System.out.println("2.two joined string :");
		System.out.println("3.equals string :");
		System.out.println("4.index string :");
		System.out.println("5.lower case string :");
		System.out.println("6.comapre string :");
		System.out.println("7.contains string :");
		System.out.println("8.endswith string :");
		System.out.println("9.Charat string :");
		System.out.println("10.empty string :");
		System.out.println("11.uper case string :");
		System.out.println("12.Trim string :");
		
		System.out.println("Choose your number :");
		int c=sc.nextInt();
		
		switch(c)
		{
			case 1:
			int length=first.length();
			System.out.println("String length :"+length);
			break;
			
			case 2:
			String joinedstring=first.concat(second);
			System.out.println("Joines String :"+joinedstring);
			break;
			
			case 3:
			boolean equals=first.equals(second);
			System.out.println("Equal String :"+equals);
			break;
			
			case 4:
			int i=second.indexOf('A');
			System.out.println("index String :"+i);
			break;
			
			case 5:
			String lc=third.toLowerCase();
			System.out.println("lower case string :"+lc);
			break;
			
			case 6:
			int com=first.compareTo(second);
			System.out.println("Compare string :"+com);
			break;
			
			case 7:
			boolean con=first.contains("DhyanI");
			System.out.println("String contains :"+con);
			break;
			
			case 8:
			System.out.println(second.endsWith("a"));
			break;
			
			case 9:
			System.out.println(third.charAt(4));
			break;
			
			case 10:
			System.out.println(second.isEmpty());
			break;
			
			case 11:
			System.out.println(third.toUpperCase());
						
			case 12:
			System.out.println(third.trim());
			break;
			
			/*case 13:
			System.out.println(first.startWith('d'));
			break;*/
			
			
		}
	}
} 
