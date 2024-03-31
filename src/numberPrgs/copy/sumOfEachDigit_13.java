package numberPrgs.copy;

public class sumOfEachDigit_13 {
	public static void main(String[] args) {
		int num=12345;
		int N,sum=0;
		
		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
			
		}
		System.out.println(sum);

	}
}
