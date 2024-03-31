package string;

public class check_containsOnlyNumbers_24 {

	public static void main(String[] args) {
		String str="456879sdfg";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				count++;
			}
		}
		if(count==str.length()) {
			System.out.println("String contains only numbers");
		}
		else {
			System.out.println("String not cointains only numbers");
		}

	}

}
