package string;

import java.util.Arrays;

public class Merge2String_28 {

	public static void main(String[] args) {
		String str1="what is your name? ";
		String str2="Is Your name sujitha?";
		String str="";
		System.out.println("1st way");
		for(int i=0;i<str1.length();i++) {
			str=str+str1.charAt(i);
		}
		for(int i=0;i<str2.length();i++) {
			str=str+str2.charAt(i);
		}
		System.out.println(str);
		
		System.out.println("2nd way");
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
		char arr3[]=new char[arr1.length+arr2.length];
		//System.out.println(arr1.length+" "+ arr2.length+" "+(int)(arr1.length+arr2.length));
		int j=0;
		for(int i=0;i<arr1.length;i++) {
			arr3[j]=arr1[i];
			j++;
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[j]=arr2[i];
			j++;
		}
		System.out.println();
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("3rd ways");
		String st1[]= {"a","b","c","d","e"};
		String st2[]= {"f","G","h","i"};
		String st="";
		
		for(int i=0;i<st1.length;i++) {
			st=st+st1[i];
		}
		for(int i=0;i<st2.length;i++) {
			st=st+st2[i];
		}
		System.out.println(st);

	}

}
