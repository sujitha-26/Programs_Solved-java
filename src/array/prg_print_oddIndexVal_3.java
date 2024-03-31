package array;
import java.util.Scanner;
import java.util.Arrays;
public class prg_print_oddIndexVal_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in) ;
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			if(i%2!=0) {
				System.out.println(a[i]);
			}
		}

	}

}
