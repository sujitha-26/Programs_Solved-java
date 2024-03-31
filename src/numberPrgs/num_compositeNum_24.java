package numberPrgs;

public class num_compositeNum_24 {
//composite num opp to prime in which num not div by 1 and itself where count>2==>composite
	public static void main(String[] args) {
		int c=2,count=0;
		for(int i=1;i<=c;i++) 
		{
			if(c%i==0) {
				count++;
				System.out.println(c%i);
			}
		}
		if(count>2) {
			System.out.println("composite number");
		}
		else if(count==2)
			System.out.println("prime number");//2=>reason: 1 &  itself only

	}

}
