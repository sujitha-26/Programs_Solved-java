package numberPrgs.copy;

public class productOfEachDigit_14 {
	public static void main(String[] args) {
		int num=1234,num1=1234;
		int prod=1,prod1=1,N;
		
		while(num!=0) {
			prod=prod*num%10;
			num=num/10;
			
		}
		System.out.println(prod);
		
		while(num1!=0) 
		{
			N=num1%10;
			prod1=prod1*N;
			num1=num1/10;
			
		}
	
	System.out.println(prod1);
	
	int num2=985,product1=1;
	for( ;num2!=0;num2/=10) {
		product1*=(num2%10);
	}
	System.out.println("Product value: "+product1);
	}
}
