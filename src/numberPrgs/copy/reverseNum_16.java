package numberPrgs.copy;

public class reverseNum_16 {

	public static void main(String[] args) {
		int num=123,N,rev=0;
		while(num>0) {
			//N=num%10;
			rev=rev*10+(num%10);
			num=num/10;
		}
		System.out.println(rev);
	}

}
