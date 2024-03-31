package string;

public class firstLast_spaceIgnore_9 {
	public static void main(String[] args) {
		String str="   hello world    ";
		int fst=0,lst=str.length()-1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(fst)==' ') {
				fst++;
			}
			if(str.charAt(lst)==' ') {
				lst--;
			}
		}
		for(int i=fst;i<=lst;i++) {
			System.out.print(str.charAt(i));
		}
	}
}
