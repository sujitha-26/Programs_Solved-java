package numberPrgs.copy;

import java.util.Scanner;

public class num_perfectNum_21 {

	public static void main(String[] args) {
		int n=7,sum=0;
		
		for(int i=1;i<n;i++)// here = is not given in order to avoid the adding of given nun to get given num 
		{
			if(n%i==0) {
			//System.out.println(i);
			sum+=i;
			}
		}
		
		if(sum==n)
		System.out.println("perfect Num");
		else
			System.out.println("not perfect");
		
		System.out.println("===========");
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the number");
//		int num=sc.nextInt();
//		int sum1=0,perf;
//		for(int i=1;i<num;i++) {
//			if(num%i==0) {
//				System.out.println(i);
//				sum1=sum1+i;
//			}
//		}
//		System.out.println("sum: "+sum1);
//		//perf=sum1-num;
//		//System.out.println(perf);
//		//  (perf==num)
//		if(sum1==num) {
//			System.out.println("perfect num");
//		}
//		else
//		{
//			System.out.println("Not perfect");
//		}

	}

}
