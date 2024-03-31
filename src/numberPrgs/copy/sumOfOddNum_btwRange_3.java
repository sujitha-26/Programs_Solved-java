package numberPrgs.copy;

public class sumOfOddNum_btwRange_3 {

	public static void main(String[] args) {
		int i=0,sum=0;
		while(i<=10) {
			if(i%2!=0) {
				System.out.println(i);
				sum+=i;
			}
			i++;
		}
		System.out.println("sum of odd is:"+sum);

	}

}
