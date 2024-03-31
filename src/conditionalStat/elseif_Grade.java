package conditionalStat;
import java.util.*;
public class elseif_Grade {

	public static void main(String[] args) {
		System.out.println("Enter the Grade:)");
		Scanner sc=new Scanner(System.in);
		char grade=sc.next().charAt(0);
		
		if(grade=='A'||grade=='a')
			System.out.println("First class");
		else if(grade=='B'||grade=='b')
			System.out.println("Second class");
		else if(grade=='C'||grade=='c')
			System.out.println("Third class");
		else if(grade=='D'||grade=='d')
			System.out.println("Fail");
		else
			System.out.println("Invalid grade");
		

	}

}
