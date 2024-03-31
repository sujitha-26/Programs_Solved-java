package array;

import java.util.Arrays;

public class sorting_BubbleSort {

	public static void main(String[] args) {
		int a[]= {78,-22,45,89,2,11};
		int temp;
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a.length-1;j++) 
			{
				if(a[j]>a[j+1]) 
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				//System.out.println(Arrays.toString(a));
			}
			System.out.println(Arrays.toString(a));
		}
		//System.out.println(Arrays.toString(a));

	}

}
