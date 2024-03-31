package array;

import java.util.Arrays;

public class reverseEachElement_17 {

	public static void main(String[] args) {
		int a[]= {34,78,784,63,01};
		int n,rem,rev=0;
		for(int i=0;i<a.length;i++) {
			n=a[i];
			System.out.print("extract dig: "+n);
			rev=0;
			while(n!=0) {
				rem=n%10;
				rev=rev*10+rem;
				n/=10;
			}
			System.out.print("==> "+rev+"\n");
		}
		System.out.println("reversed arrays is:"+Arrays.toString(a));
	}

}
