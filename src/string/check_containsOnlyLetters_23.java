package string;

public class check_containsOnlyLetters_23 {

	public static void main(String[] args) {
		String str="hai hello welcome";
		
		int flag=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z' ||str.charAt(i)>='A' && str.charAt(i)<='Z' ||str.charAt(i)==' ') {
				flag=0;
			}
			else {
				System.out.println("String not cointains only alphabets");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			
			System.out.println(str+": String cointains only alphabets: ");
		}
		//Another way: in String contains only digit
	}

}
