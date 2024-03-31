package numberPrgs;
import java.util.*;
public class asciiVal_intOfAscii {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start char to print in caps");
		char str=sc.next().charAt(0);
		System.out.println("Enter the end char to print in caps");
		char end=sc.next().charAt(0);
		for(char ch=str;ch<=end;ch++) {
			int num=ch;
			System.out.println(ch+" --> "+num);
			
		}
	}

}
