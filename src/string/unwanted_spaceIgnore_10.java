package string;

public class unwanted_spaceIgnore_10 {

	public static void main(String[] args) {
		String str="hello  java is a           programming     lang";
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==' ' && str.charAt(i+1)==' ') {
				
			}
			else {
				System.out.print(str.charAt(i));
			}
		}

	}

}
