package numberPrgs;

public class startNum_EvenOrOdd_15 {

	public static void main(String[] args) {
		int num=92345;
		//while method
		while(num>9)
		{
			num/=10;
		}
		if(num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
		
		//by reverse
		int b=585678,rev=0;
		for(;b!=0;b=b/10) {
			rev=rev*10+(b%10);
		}
		System.out.println(rev);
		int startDigit=rev%10;
		System.out.println(startDigit);
		if(startDigit%2==0) 
		{
			System.out.println("Even");
		}
		else 
		{
			System.out.println("Odd");
		}
		
		//int num=4123,temp=num,rev=0;
//		while(num>0) {
//			rev=rev*10+(num%10);
//			num=num/10;
//		}
//		System.out.println("Actual num: "+temp);
//		//System.out.println("rev val: "+rev);
//		int dig=rev%10;
//		System.out.println("First Dig of num: "+dig);
//		System.out.println("So the dig is: "+ ((dig%2==0)?"Even":"Odd"));
//		
//		
//		}
	}

}
