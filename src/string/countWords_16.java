package string;

public class countWords_16 {

	public static void main(String[] args) {
		String s="c c++ C# python";
		int count=1;
		if(s.charAt(0)==' ') {
			count=0;
		}
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
				count++;
			}
			
		}
		System.out.println(count);
	}

}
