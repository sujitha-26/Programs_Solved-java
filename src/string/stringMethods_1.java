package string;

import java.util.Arrays;

public class stringMethods_1 {

	public static void main(String[] args) {
		String s1="java";
		String s2=new String("java");
		String s3="java";
		String s4=new String("java");
		System.out.println("---1)(==)---");
		System.out.println(s1==s3);//true
		System.out.println(s2==s4);//false
		System.out.println();
		
		System.out.println("---2)equals()---");
		System.out.println(s1.equals(s3));//true
		System.out.println(s2.equals(s4));//true
		System.out.println();
		
		System.out.println("---3)length()---");
		System.out.println(s1.length());
		System.out.println();
		
		System.out.println("---4)charAt()---");
		System.out.println(s1.charAt(0));
		System.out.println();
		
		System.out.println("---5)Extract all using charAt()---");
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		System.out.println();
		
		String s="java is a programming language";
		System.out.println("---6)substring Of string---");
		System.out.println(s.substring(10));
		System.out.println(s.substring(10,21));
		System.out.println();
		
		
		System.out.println("---7)concat()---");
		String s5="sujitha ";
		String s6="siva";
		System.out.println(s5.concat(s6));
		System.out.println();
		
		System.out.println("---8)upperCase---");
		String s7="hello123bye";
		System.out.println(s7.toUpperCase());
		System.out.println();
		
		System.out.println("---9)lowerCase---");
		String s8="APPLEb";
		System.out.println(s8.toLowerCase());
		System.out.println();
		
		System.out.println("---10)trime:leading and trailing whitespaces---");
		String a="    hello    world";
		System.out.println(a.trim());
		System.out.println();
		
		System.out.println("---11)isEmpty---");
		String b="    hello    world   ";
		String c="";
		String d=" ";
		System.out.println(b.isEmpty());
		System.out.println(c.isEmpty());
		System.out.println(d.isEmpty());
		System.out.println();
		
		System.out.println("---12)indexOf---");
		String str="sujitha6 is learning";
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('6'));
		System.out.println();
		
		System.out.println("---13)lastindexOf---");
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.indexOf('a'));
		
		System.out.println("---14)cointains---");
		String str1="java programming language";
		String str2="Java";
		String str3="language";
		System.out.println(str1.contains(str2));
		System.out.println(str1.contains(str3));
		System.out.println();
		
		System.out.println("---15)toCharArray,16)split()---");
		String ss="java is a programming lang";
		char ch[]=ss.toCharArray();
		System.out.println(ch);
		System.out.println(Arrays.toString(ch));
		//String ss1[]=ss.split(" ");
		String ss1[]=ss.split("a");
		System.out.println(Arrays.toString(ss1));
		
		
	}

}
