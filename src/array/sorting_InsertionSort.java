package array;

import java.util.Arrays;

public class sorting_InsertionSort {

	public static void main(String[] args) {
		int a[]= {89,22,10,56,6,-1};
		int j,temp;
		for(int i=1;i<a.length;i++) {
			j=i-1;
			temp=a[i];
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		System.out.println(Arrays.toString(a));

	}

}
