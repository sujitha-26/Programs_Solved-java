package string;

import java.util.Arrays;

public class reverse_Eachword_InString_19 {

	public static void main(String[] args) {
		String str="hai bye hi hello";
		String a[]=str.split(" ");
		System.out.println(Arrays.toString(a));
		String rev="";
		for(int i=0;i<a.length;i++) 
		{
			rev="";
			String str1=a[i];
			for(int j=str1.length()-1;j>=0;j--) {
				char ch=str1.charAt(j);
				rev=rev+ch;
				
			}	
			a[i]=rev;
		}
		System.out.println(rev);
		System.out.println(Arrays.toString(a));
	}

}
