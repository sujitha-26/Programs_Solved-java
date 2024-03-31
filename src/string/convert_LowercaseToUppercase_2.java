package string;

public class convert_LowercaseToUppercase_2 {

	public static void main(String[] args) {
		String s="convert2$ lower to upper case";
		char c;
		for(int i=0;i<s.length();i++) {
			c=s.charAt(i);
			if(c>='a' && c<='z') {
				int ch=c-32;
				System.out.print((char)ch);
			}
			else if(c>='A' && c<='Z') {
				int ch=c+32;
				System.out.print((char)ch);
			}
			else {
				System.out.print(c);
			}
		}

	}

}
