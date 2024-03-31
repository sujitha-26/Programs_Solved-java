package numberPrgs;

import java.util.Scanner;

public class PrintAsciiVal_AtoZ_6 {

	public static void main(String[] args) 
	{
		for(char ch='A';ch<='Z';ch++) {
			System.out.println(ch+"-->"+(int)ch);
		}
		
		System.out.println(" ==================");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start char to print in caps");
		char str=sc.next().charAt(0);
		System.out.println("Enter the end char to print in caps");
		char end=sc.next().charAt(0);
		for(char ch=str;ch<=end;ch++) {
			int num=ch;
			System.out.println(ch+" --> "+num);
			
		}
	}

}
