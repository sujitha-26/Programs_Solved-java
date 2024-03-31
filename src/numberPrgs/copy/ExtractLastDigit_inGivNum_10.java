package numberPrgs.copy;

public class ExtractLastDigit_inGivNum_10 {

	public static void main(String[] args) {
		int num=23489;
		while(num>9) 
		{
			num=num/10;
			
		}
		System.out.println(num);
	}

}
