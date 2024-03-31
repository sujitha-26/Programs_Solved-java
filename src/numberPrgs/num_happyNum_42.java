package numberPrgs;

public class num_happyNum_42 {

	public static void main(String[] args) {
		int num=1,sqrVal,rem,sum=0;
		while(num!=1 && num!=4) 
		{
			sum=0;
			while(num>0) 
			{
				rem=num%10;
				sqrVal=rem*rem;
				sum=sum+sqrVal;
				num/=10;
			
			}
			System.out.println(sum);
//			if(sum!=1||sum!=4) {
//				num=sum;
//			}
			num=sum;
		
		}
		if(num==1) 
		{
			System.out.println("Happy Num");
		}
		else if(num==4) 
		{
			System.out.println("Sad Num");
		}

	}

}
