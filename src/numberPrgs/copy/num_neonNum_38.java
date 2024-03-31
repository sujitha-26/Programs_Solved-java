package numberPrgs.copy;

public class num_neonNum_38 {

	public static void main(String[] args) {
		int num=9,sqrNum=num*num,sum=0;
		while(sqrNum!=0) {
			sum=sum+(sqrNum%10);
			sqrNum=sqrNum/10;
		}
		System.out.println(sum);
		if(num==sum) {
			System.out.println(num+" is_Neon num");
		}
		else {
			System.out.println(num+" is_not neon num");
		}
	}

}
