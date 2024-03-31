package string;

import java.util.Arrays;

public class Anagram_29 {

	public static void main(String[] args) {
		String str1="hello";
		String str2="lohel";
		
		//covert to char array
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		
		//sorting
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));
		
		//convert charArray to String
		//**************imp******USing constructor also can covert char array to string, where constructor will accept char array to string 
		String st=new String(ch1);
		System.out.println("---"+st+"--");
		//**************imp******
		
		String store1="";
		String store2="";
		for(int i=0;i<ch1.length;i++) {
			store1=store1+ch1[i];
		}
		System.out.println(store1);
		for(int i=0;i<ch1.length;i++) {
			store2=store2+ch2[i];
		}
		System.out.println(store2);
		
		//compare both are same or not (check Anagram or not)
		if(store1.equals(store2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}

	}

}
