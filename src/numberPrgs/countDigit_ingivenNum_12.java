package numberPrgs;

public class countDigit_ingivenNum_12 {

	public static void main(String[] args) {
		int num=56780;
		int N,count=0;
		
		while(num!=0) {
			N=num%10;
			num=num/10;
			count++;
		}
		System.out.println(count);

	}

}
