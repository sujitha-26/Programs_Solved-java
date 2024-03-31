package string;

public class emailValidation_31 {

	public static void main(String[] args) {
		//first && last char should not (.)
		//char in username can letter ,numbers,(.),& should not(...)consecutive dots
		//domain should be @gmail.com
		//should not contain any other symbols in username 
		
		String str="su@gmail.com";
		int diff=str.length()-10;
		//System.out.println(diff);
		
		char f=str.charAt(0);
		char l=str.charAt(diff-1);
		int flag=0;
		
		if(((f>='a'&&f<='z') || (f>='0'&& f<='9')) && ((l>='a'&&l<='z') || (l>='0'&& l<='9'))){
			flag=1;
		}
		else
		{
			System.out.println("Letters in first and last should be (a-z) or (0-9)");
		}
		if(flag==1 && diff>8) 
		{
			for(int i=1;i<diff;i++) 
			{
				char ch=str.charAt(i);
				if((ch>='a'&&ch<='z')|| (ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9')||(ch=='.'&&str.charAt(i+1)!='.')) {
					
				}
				else {
					System.out.println("Username should contains only '.';other symbols and consecutive dot or not allowed");
					flag=0;
					break;
				}
			}
			
			
		}
		else {
			System.out.println("username length should more than or equal to 8");
			flag=0;
		}
		String domain=str.substring(diff,str.length());
		if(flag==1 && domain.equals("@gmail.com")) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		
	}

}
