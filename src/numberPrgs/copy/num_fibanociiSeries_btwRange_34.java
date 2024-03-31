package numberPrgs.copy;

public class num_fibanociiSeries_btwRange_34 {

	public static void main(String[] args) {
		int t1=0,t2=1,targetEnd=5,targetstart=2,sum;
		for(int i=1;i<=targetEnd;i++) {
			if(i>=targetstart && i<=targetEnd)
			{
			System.out.println(t1);
			}
			sum=t1+t2;
			t1=t2;
			t2=sum;
		}

	}

}
