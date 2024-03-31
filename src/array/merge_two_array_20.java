package array;

import java.util.Arrays;

public class merge_two_array_20 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10,11};
		int len=(a.length+b.length);
		//System.out.println(len);
		int c[]=new int[len];
		int j=0;
		
		for(int i=0;i<a.length;i++) {
			c[j]=a[i];
			j++;
		}
		for(int i=0;i<b.length;i++) {
			c[j]=b[i];
			j++;
		}
		System.out.println(Arrays.toString(c));
		
		
	}
}
