package numberPrgs.copy;

public class num_sumOfFactor_19 {
	public static void main(String[] args) {
	int num=24,sum=0;
	for(int i=1;i<=num;i++) 
	{
		if(num%i==0) 
		{
			System.out.println(i);
			sum+=i;
		}
	}
	System.out.println("sum is:"+sum);
	}
}
