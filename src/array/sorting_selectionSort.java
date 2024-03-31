package array;

import java.util.Arrays;

public class sorting_selectionSort {

	public static void main(String[] args) {
		int a[]= {67,2,54,30,22,82,5};
		int min,temp;
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[min]>a[j]) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		System.out.println(Arrays.toString(a));

	}

}
