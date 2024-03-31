package numberPrgs;

public class num_primeNum_22 {
	public static void main(String[] args) {
		int num=31,count=0;
		for(int i=1;i<=7;i++) {
			if(num%i==0) {
				//System.out.println(num%i);
				count++;
			}
		}
		if(count==2) 
		{
			System.out.println("prime");
		}
		else 
		{
				System.out.println("not prime");
		}
		
	}

}
