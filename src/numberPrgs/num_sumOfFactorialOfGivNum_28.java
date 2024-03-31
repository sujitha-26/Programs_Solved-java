package numberPrgs;

public class num_sumOfFactorialOfGivNum_28 {
	public static void main(String[] args) {
		int num=145,rem,fact,sum=0;
		while(num>0) {
			fact=1;
			rem=num%10;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			System.out.println("fact:"+fact);
			sum=sum+fact;
			System.out.println("sum:"+sum);
			num=num/10;
		}
		System.out.println("Total:"+sum);
		
	}
}
