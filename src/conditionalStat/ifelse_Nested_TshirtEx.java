package conditionalStat;
import java.util.*;
public class ifelse_Nested_TshirtEx 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//char ch='s';
		System.out.println("Enter the number of T-shirts to buy");
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter the T-shirt size");
			char ch=sc.next().charAt(0);
		
			if(ch=='s') 
			{
				System.out.println("Enter the price value");
				double price=sc.nextDouble();
				if(price<=100.0) 
				{
				System.out.println("T-shirt is within your range:can buy");
				}
				else
				{
				System.out.println("T-shirt is not within the range:cannot buy");
				}
				System.out.println("........");
			}
			else 
			{
				System.out.println("Invalid t-shirt size");
				System.out.println("........");
			}
		}
		System.out.println("Thank you:)");
	}
}
