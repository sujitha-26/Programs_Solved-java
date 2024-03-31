package numberPrgs;

public class LargestNum_inGivRange_5 {
	public static void main(String[] args) 
	{
		int i=1,Lag=1;
		while(i<=10) {
			if(Lag<i) {
				Lag=i;
			}
			i++;
		}
		System.out.println(Lag);
	}
}
