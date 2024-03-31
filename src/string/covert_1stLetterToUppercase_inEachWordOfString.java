package string;

import java.util.Arrays;

public class covert_1stLetterToUppercase_inEachWordOfString {

	public static void main(String[] args) {
		String str="java is programming language";
		String array[]=str.split(" ");
		System.out.println(Arrays.toString(array));
		
		String store="";
		for(int i=0;i<array.length;i++) {
			store=array[i];
			for(int j=0;j<store.length();j++) {
				
			}
		}
	
		
		
	}

}






































//
//char c = 0;
//for(int i=0;i<st.length;i++) 
//{
//	String ch=st[i];//java
//	String wrd="";
//	for(int j=0;j<ch.length();i++) 
//	{
//		if(ch.charAt(0)>='a' && ch.charAt(0)<='z') 
//		{
//			c=(char)(ch.charAt(0)-32);
//			System.out.println(c);
//			
//		}
//		wrd=wrd+c;
//	}
//	st[i]=wrd;
//	
//}
//System.out.println(Arrays.toString(st));