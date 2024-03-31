package numberPrgs.copy;

public class twistedprime {

	public static void main(String[] args) {
		int num=13,count=1,rev=0,count1=1;
		for(int i=2;i<=num;i++) 
		{
			if(num%i==0) {
				count++;
			}
		}
		
		if(count==2) 
		{
			
			while(num!=0) 
			{
				rev=rev*10+(num%10);
				num=num/10;
			}
			for(int i=2;i<=rev;i++) 
			{
				if(rev%i==0) {
					count1++;
				}
			}
			if(count1==2) {
				System.out.println("Twisted prime");
			}
			else {
				System.out.println("Not twisted prime");
			}
		}
		else {
			System.out.println("Given no is not prime number");
		}
//		if(flag==1) {
//			System.out.println("Twist prime");
//		}
//		else {
//			System.out.println("Not twist prime");
//		}

	}

}
