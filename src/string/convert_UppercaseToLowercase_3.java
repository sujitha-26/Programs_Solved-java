package string;

public class convert_UppercaseToLowercase_3 {

	public static void main(String[] args) {
		String str="SUJITHA";
		char c;
		for(int i=0;i<str.length();i++) {
			c=str.charAt(i);
			if(c>='A' && c<='Z') {
				int ch=c+32;
				System.out.print((char)ch);
			}
		}

	}

}
