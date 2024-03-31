package conditionalStat;
import java.util.*;
public class switch_simpleCalc {

	public static void main(String[] args) {
		System.out.println("addition");
		System.out.println("subtraction");
		System.out.println("Multiplication");
		System.out.println("division");
		System.out.println("...............");
		
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the first operand");
//		int X=sc.nextInt();
//		System.out.println("Enter the second operand");
//		int Y=sc.nextInt();
		
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice) 
		{
			case 1:
			{
				System.out.println("Enter the first operand to add");
				int X=sc.nextInt();
				System.out.println("Enter the second operand to add");
				int Y=sc.nextInt();
				int res=X+Y;
				System.out.println("Addition: "+res);
				break;
		    }
			case 2:
			{
				System.out.println("Enter the first operand to sub");
				int X=sc.nextInt();
				System.out.println("Enter the second operand to sub");
				int Y=sc.nextInt();
				int res=X-Y;
				System.out.println("Subtraction: "+res);
				break;
		    }
			case 3:
			{
				System.out.println("Enter the first operand to multi");
				int X=sc.nextInt();
				System.out.println("Enter the second operand to multi");
				int Y=sc.nextInt();
				int res=X*Y;
				System.out.println("Multiplication: "+res);
				break;
		    }
			case 4:
			{
				System.out.println("Enter the first operand to divide");
				int X=sc.nextInt();
				System.out.println("Enter the second operand to divide");
				int Y=sc.nextInt();
				int res=X/Y;
				System.out.println("Division: "+res);
				break;
		    }
			default:
			{
				System.out.println("Invalid Input");
			}		
		}
	}
}
