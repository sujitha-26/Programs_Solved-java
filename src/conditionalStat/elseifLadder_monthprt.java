package conditionalStat;

import java.util.Scanner;

public class elseifLadder_monthprt {

	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num==1)
			System.out.println("jan");
		else if(num==2)
			System.out.println("feb");
		else if(num==3)
			System.out.println("March");
		else if(num==4)
			System.out.println("April");
		else if(num==5)
			System.out.println("May");
		else if(num==6)
			System.out.println("june");
		else if(num==7)
			System.out.println("jully");
		else if(num==8)
			System.out.println("Augest");
		else if(num==9)
			System.out.println("sept");
		else if(num==10)
			System.out.println("oct");
		else if(num==11)
			System.out.println("nov");
		else if(num==12)
			System.out.println("dec");
		else
			System.out.println("Invalid num");
		

	}

}
