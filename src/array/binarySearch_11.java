package array;
import java.util.Arrays;

public class binarySearch_11 {

	public static void main(String[] args) {
		int a[]= {2,33,4,98,22};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int ele=33,flag=0;
		int l=a[0], r=a.length-1,mid;
		
		while(l<=r) 
		{
			mid=(l+r)/2;
			if(ele==a[mid])
			{
				flag=1;
				System.out.println("Element found in:"+mid);
				break;
			}
			else if(ele<a[mid]) {
				r=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		if(flag==0) {
			System.out.println("Element not found");
		}

	}

}
