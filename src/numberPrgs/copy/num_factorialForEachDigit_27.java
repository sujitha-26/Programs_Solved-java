package numberPrgs.copy;

public class num_factorialForEachDigit_27 {
	public static void main(String[] args) 
	{
		int num=123,lastDigit,i;
		
		
		for(;num!=0;num=num/10) 
		{
			int fact=1;
			lastDigit=num%10;
			for(i=1;i<=lastDigit;i++) 
			{
				fact=fact*i;
			}
			
			System.out.println("Factorial of "+lastDigit+"-->"+fact);
			
		}
		
		
		System.out.println("==============");
		int n=345;
		while(n>0) {
			int rem=n%10;
			int fact1=1;
			for(int j=1;j<rem;j++) {
				fact1=fact1*j;
			}
			System.out.println(rem+"=>"+fact1);
			n=n/10;
			
		}
	}
}
