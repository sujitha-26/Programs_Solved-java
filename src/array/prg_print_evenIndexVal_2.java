package array;

import java.util.Arrays;

public class prg_print_evenIndexVal_2 {

	public static void main(String[] args) {
		int a[]= {5,2,32,6,11,10};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				System.out.println(a[i]);
				
			}
		}
		
	}

}
