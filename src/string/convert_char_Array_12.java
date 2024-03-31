package string;

import java.util.Arrays;

public class convert_char_Array_12 {

	public static void main(String[] args) {
		String str="java program";
		System.out.println("------1 way---------");
		char a[]=new char[str.length()];
		for(int i=0;i<str.length();i++) 
		{
			char ch=str.charAt(i);
			a[i]=ch;
		}
		System.out.println(Arrays.toString(a));
		System.out.println();
		
		System.out.println("------2 way:By Inbuild---------");
		char b[]=str.toCharArray();
		System.out.println(Arrays.toString(b));
	}

}
