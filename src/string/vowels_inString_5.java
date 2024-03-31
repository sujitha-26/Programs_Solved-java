package string;

public class vowels_inString_5 {

	public static void main(String[] args) {
		String str="sd a fg e hj i hy o hy u hy a";
		char ch;
		for(int i=1;i<str.length();i++) {
			ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				System.out.print(ch+" ");
			}
		}

	}

}
