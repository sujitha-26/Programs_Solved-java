package numberPrgs.copy;

public class num_fibonacciSeries_32 {

	public static void main(String[] args) {
		int n1=0,n2=1,sum,num=10,i;
		for(i=1;i<=num;i++)
		{
			System.out.println(n1);
			sum=n1+n2;
			n1=n2;
			n2=sum;
			
		}
		
		//by while
		System.out.println("============");
		i=1;
		n1=0;
		n2=1;
		while(i<=num) {
			System.out.println(n1);
			sum=n1+n2;
			n1=n2;
			n2=sum;
			i++;
		}

	}

}
