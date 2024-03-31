package string;

import java.util.Arrays;

public class covert_toIntArray_11 {

	public static void main(String[] args) {
		String str="java is programming language";
		int a[]=new int[str.length()];
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			a[i]=(int)ch;
		}
		System.out.println(Arrays.toString(a));
	}

}
