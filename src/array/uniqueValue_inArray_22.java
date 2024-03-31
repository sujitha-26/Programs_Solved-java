package array;

import java.util.Arrays;

public class uniqueValue_inArray_22 {

	public static void main(String[] args) {
		int a[]= {66,88,99,66,44,88,99,23,0,0};
		int count;
		for(int i=0;i<a.length;i++) {
			count=1;
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]==a[j]) {
					count++;
					a[j]=Integer.MAX_VALUE;
					
				}
			}
			//System.out.println(Arrays.toString(a));
			if(a[i]!=Integer.MAX_VALUE && count==1) {
				System.out.println(a[i]);
			}
		}
//		for(int i=0;i<a.length;i++) {
//			int ele=a[i];
//			int count=1;
//			for(int j=i+1;j<a.length;j++) 
//			{
//				if(ele==a[j])
//				{
//					count++;
//					a[j]=Integer.MIN_VALUE;
//					//a[j]=Integer.MAX_VALUE;
//				}
//			}
//			if(a[i]!=Integer.MIN_VALUE && count==1) {
//			System.out.println(ele+"==>"+count);
//			}
//		}
		
	}

}
