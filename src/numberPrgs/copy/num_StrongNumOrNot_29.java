package numberPrgs.copy;

public class num_StrongNumOrNot_29 {
	public static void main(String[] args) {
		int num=24,temp=num,rem,fact,sum=0;
		for(;num>0;num=num/10) {
			rem=num%10;
			fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
		}
		System.out.println("sum is:"+sum);
		if(sum==temp) {
			System.out.println("strong");
		}
		else {
			System.out.println("Not Strong");
		}
	}
}
