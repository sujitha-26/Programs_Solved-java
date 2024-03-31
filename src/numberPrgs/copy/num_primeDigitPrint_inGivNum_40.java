package numberPrgs.copy;

public class num_primeDigitPrint_inGivNum_40 {

	public static void main(String[] args) {
		int num=1539,rem,count;
		while(num!=0) {
			rem=num%10;
			count=0;
			for(int i=1;i<=rem;i++) 
			{
				if(rem%i==0) 
				{
					count++;
				}
			}
			if(count==2) {
				System.out.println(rem+"==>"+"Prime");
			}
			else {
				System.out.println(rem+"==>"+"Not Prime");
			}
			num=num/10;
		}

	}

}
