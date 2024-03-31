package numberPrgs.copy;

import java.util.Scanner;

public class printTables_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the table to multiply");
		int t=sc.nextInt();
		for(int i=1;i<=16;i++) {
			System.out.println(t+"*"+i+"="+t*i);
		}
	}

}

