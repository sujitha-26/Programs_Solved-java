package numberPrgs;

public class num_perfectSquareOrnot_36 {

	public static void main(String[] args) {
		int num=26,flag=0,i;
		for(i=1;i<=num/2;i++) 
		{
			//System.out.println(num/2);
			if(i*i==num) {
				flag=1;
				break;
			}
			
		}
		if(flag==1) {
			System.out.println("It is perfect square \n"+" & value of perfect square is: "+i);
		}
		else {
			System.out.println("Not A perfect square root value");
		}

	}

}
