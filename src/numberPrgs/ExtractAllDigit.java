package numberPrgs;

public class ExtractAllDigit {
	public static void main(String[] args) {
		int num=5678,N;
		while(num!=0) {
			N=num%10;
			num=num/10;
		}
		System.out.println(num);
	}
}
