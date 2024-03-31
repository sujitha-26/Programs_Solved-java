package array;

import java.util.Arrays;

public class insert_ele_18 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,6};
		int b[]=new int[a.length+1];
		int ele=5,j=0,ins=4;
		for(int i=0;i<b.length;i++) {
			if(ins==i) {
				b[i]=ele;
			}
			else {
			b[i]=a[j];
			j++;
			}
		}
		System.out.println(Arrays.toString(b));
		
	}

}
