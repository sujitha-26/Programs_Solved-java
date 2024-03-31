package numberPrgs.copy;

import java.util.Iterator;

public class num_palindrome_17 {

	public static void main(String[] args) {
		int num=121,temp=num,rev=0;
		for(;num>0;num/=10) 
		{
			rev=rev*10+(num%10);
		}
		System.out.println(rev);
		
		if(temp==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		
		}
		
		
		System.out.println("==========");
		int n=134,temp1=134,rev1=0;
		while(n!=0) {
			rev1=rev1*10+(n%10);
			n=n/10;
		}
		System.out.println(rev1);
		if(temp1==rev1) {
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}

}
