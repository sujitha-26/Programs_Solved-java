package numberPrgs;

public class Num_spiNo_44 {

	public static void main(String[] args) {
		int a=123,temp=a,rem,sum=0,prd=1;
		
		while(a!=0) {
			rem=a%10;
			sum=sum+rem;
			prd=prd*rem;
			a/=10;
		}
		if(sum==prd) {
			System.out.println(temp+" is a spi number");
		}
		else {
			System.out.println(temp+" is not a spi number");
		}

	}

}
