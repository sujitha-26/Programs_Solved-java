package numberPrgs.copy;

public class num_productOfFactors_20 {

	public static void main(String[] args) {
		int num=6,prod=1;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
				prod=prod*i;
			}
		}
		System.out.println(prod);

	}

}
