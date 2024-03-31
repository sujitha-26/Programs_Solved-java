package numberPrgs.copy;

public class num_findFactorialForEachDig_sumOfFact {

	public static void main(String[] args) {
		int num=1,temp=num,rem,fact=1,sum=0;
		while(num>0)
		{
			rem=num%10;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			System.out.println(fact);
			sum=sum+fact;
			num=num/10;
		}
		System.out.println("sum: "+sum);
		//System.out.println(temp);
		if(temp==sum) {
			System.out.println("StrongNum");
		}
		else
		{
			System.out.println("Not a strong Num");
		}
	}

}
