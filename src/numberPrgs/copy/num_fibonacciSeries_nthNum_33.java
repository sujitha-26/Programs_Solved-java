package numberPrgs.copy;

public class num_fibonacciSeries_nthNum_33 {

	public static void main(String[] args) {
		int n1=0,n2=1,sum,target=8;
		for(int i=1;i<=10;i++) {
			if(i==target) {
				System.out.println(n1);
			}
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
	}

}
