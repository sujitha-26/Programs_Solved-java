package numberPrgs;

public class num_atomorphic_43 {

	public static void main(String[] args) {
		int n=4,sqrNum=n*n,flag=0;
		while(n>0) 
		{
			if(n%10!=sqrNum%10) {
				flag=1;
				System.out.println("Not automorphic");
				break;
			}
			n=n/10;
			sqrNum=sqrNum/10;
		}
		if(flag==0) {
			System.out.println("Automorphic");
		}
	}

}
