package conditionalStat;

import java.util.Scanner;

public class ifElse_posOrneg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x=sc.nextDouble();
		
		if(x>=0) {
			System.out.println("Positive num");
		}
		else {
			System.out.println("Not positive num");
		}

	}

}
