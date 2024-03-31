package numberPrgs;

public class num_compositeNum_btwRange_25 {

	public static void main(String[] args) {
		int count;
		for(int n=5;n<=50;n++) 
		{
			count=0;
			for(int i=1;i<=n;i++) 
			{
				if(n%i==0) 
				{
				count++;
				}
			}
			if(count>2) {
				System.out.println(n);
			}
//			else{
//				System.out.println("Not composite");
//			}
		}

	}

}
