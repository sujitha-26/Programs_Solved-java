package numberPrgs;

public class num_sunnyNumOrnot_37 {

	public static void main(String[] args) {
		int n=10;
		int num=n+1,flag=0,i;

		for(i=1;i<=num/2;i++) {
			if(i*i==num) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("square root value of "+num+" is: "+i);
			System.out.println(n+" is a sunny number");
		}
		else {
			System.out.println(n+" is not sunny number");
		}
	}

}
