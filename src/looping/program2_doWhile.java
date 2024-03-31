package looping;
import java.util.*;
public class program2_doWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		do {
			System.out.println("welcome");
			
			System.out.println("Do you want to continue? (Y/N): ");
			ch=sc.next().charAt(0);
			if(ch=='y' || ch=='Y')
			{
				System.out.println("Yes");
			}
			else if(ch=='N' || ch=='n' )
			{
				System.out.println("No");
			}
			else
				System.out.println("Invalid output");
			
		}
		while(ch=='y' || ch=='Y');
		
		

	}

}
