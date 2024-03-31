package string;

import java.util.Arrays;

public class covert_stringArray_13 {

	public static void main(String[] args) {
		String str="java is a programming lang";
		str=str.trim();
		//word count
		int c=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ' ) {
				c++;
			}
		}
		System.out.println(c);
		
		//converting to array
		String arr[]=new String[c];
		String s="";
		int j=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				arr[j]=s;
				j++;
				s="";
				
			}
			else if(ch!=' ') {
				s=s+ch;
			}
		}
		arr[j]=s;
		System.out.println(Arrays.toString(arr));
	}
}
