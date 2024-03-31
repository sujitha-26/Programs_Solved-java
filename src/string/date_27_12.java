package string;
import java.util.*;
public class date_27_12 {

	public static void main(String[] args) 
	{

		
		
		
		
		
		
		
		
		
		
		System.out.println("====ByBuild in func======");
//		String s="hello world!";
//		System.out.println(s.toUpperCase());
		
		System.out.println("====user input======");
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value:");
//		char c=sc.next().charAt(0);
		
		System.out.println("=====upper to lower=====");
		String str="6^98sujitha";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c>='a' && c<='z') {
				int ch=c-32;
				System.out.println((char)ch);
			}
			else if(c>='A' && c<='Z') {
				int ch=c+32;
				System.out.println((char)ch);
			}
			else {
				System.out.println(c);
			}
		}
		System.out.println("=====count=====");
		String str1="tom123@gmail.com ";
		int Cletter=0,sletter=0,symbol=0;
		for(int i=0;i<str1.length();i++) {
			char c=str1.charAt(i);
			
			if(c>='a' && c<='z') {
				Cletter++;
				
			}
			else if(c>='A' && c<='Z') {
				sletter++;
			}
			else {
				symbol++;
				//System.out.println(c);
			}
		}
		System.out.println(Cletter);
		System.out.println(sletter);
		System.out.println(symbol);
		
		
		System.out.println("======printing vowels=======");
		String s="welcome";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				System.out.println(ch);
			}
		}
		
		System.out.println("======remove vowels or print consonents=======");
		String s1="welcome";
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
				System.out.println(ch);
			}
		}
		
		System.out.println("======count of space=======");
		String s2="   hello  world   ";
		int count=0;
		for(int i=0;i<s2.length();i++) {
			char ch=s2.charAt(i);
			if(ch==' ') 
			{
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println("======store ascii value in same index=======");
		String s3="apple";
		int[] a=new int[s3.length()];
		for(int i=0;i<s3.length();i++) {
			char ch=s3.charAt(i);
			a[i]=(int)ch;
		}
		System.out.println(Arrays.toString(a));
		
		System.out.println("======remove begining and ending white spaces=======");
		String s4="   apple   ";
		System.out.println(s4.trim());
		for(int i=0;i<s3.length();i++) {
			char ch=s3.charAt(i);
			
		}
		
		
		String date="2-1-24";
		System.out.println("reverse hello");
		String str2="hello";
		for(int i=str2.length()-1;i>=0;i--) {
			System.out.print(str2.charAt(i));
		}
		
		//by using concad string rev;
		//palindrome
		
		
	}
}

