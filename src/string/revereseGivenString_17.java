package string;

public class revereseGivenString_17 {

	public static void main(String[] args) {
		String str="hello";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) 
		{
			//System.out.print(str.charAt(i));
			char ch=str.charAt(i);
			
			rev=rev+ch;
			System.out.println(rev);
		}
		System.out.println();
		System.out.println("rev value is:"+rev);
		
		
	}

}
