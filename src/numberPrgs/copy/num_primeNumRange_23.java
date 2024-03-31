package numberPrgs.copy;

public class num_primeNumRange_23 {

	public static void main(String[] args) {
		int count;
		for(int n=1;n<=50;n++) 
		{
			count=0;
			for(int i=1;i<=n;i++) 
			{
				if(n%i==0) {
					count++;
				}
				
			}
			if(count==2) {
				System.out.println(n);
			}
		}
		
	}

}
