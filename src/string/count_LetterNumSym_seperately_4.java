package string;

public class count_LetterNumSym_seperately_4 {

	public static void main(String[] args) {
		String str="TomAndJerry@789$50";
		int countU=0,countL=0,countS=0,countN=0;
		char ch;
		for(int i=0;i<str.length();i++) 
		{
			ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
				countL++;
			}
			else if(ch>='A' && ch<='Z'){
				countU++;
			}
			else if(ch>='0' && ch<='9') {
				countN++;
			}
			else {
				countS++;
			}
		}
		System.out.println("Capitalcase count: "+countU);
		System.out.println("Lowercase count: "+countL);
		System.out.println("Number count: "+countN);
		System.out.println("Symbaol count: "+countS);
		System.out.println();
		int sum=countU+countL+countN+countS;
		System.out.println("Total count: "+sum);

	}

}
