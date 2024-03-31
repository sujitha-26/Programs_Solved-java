package string;

public class palindrome_18 {

	public static void main(String[] args) {
		String str="racecar";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) 
		{
			char ch=str.charAt(i);
			rev=rev+ch;
			
		}
		System.out.println(rev);
		System.out.println(str);
		if(str.equals(rev)) 
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Not Palindrome");
		}

	}

}
