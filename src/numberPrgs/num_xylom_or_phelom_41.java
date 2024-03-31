package numberPrgs;

public class num_xylom_or_phelom_41 {

	public static void main(String[] args) {
		int num=12326,rem,sumI=0,sumO=0;
		int lastNum=num%10;
		num=num/10;
		while(num>9) 
		{
			rem=num%10;
			sumI=sumI+rem;
			num/=10;
		}
		System.out.println(sumI);
		sumO=lastNum+num;
		System.out.println(sumO);
		if(sumI==sumO) {
			System.out.println("Xylom");

		}
		else {
			System.out.println("phylom");
		}
		
		
	}

}
