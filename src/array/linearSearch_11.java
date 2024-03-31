package array;

import java.util.Scanner;
import java.util.Arrays;
public class linearSearch_11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();	
		}
		System.out.print("array is: ");
		System.out.println(Arrays.toString(a));
		System.out.print("Enter search element:");
		int i,flag=0;
		int element=sc.nextInt();
		for(i=0;i<a.length;i++) {
			if(element==a[i]) {
				//System.out.println("Element found in index of: "+i);
				flag=1;
				break;
			}
//			else {
//				System.out.println("Not Found");
//			}
		}
		if(flag==1) {
			System.out.println("Element found in index of: "+i);
		}
		else {
			System.out.println("Element Not Found");
		}
//		int a[]= {10,20,30,40,90,100};
//		int e=560,flag=0;
//		for(int i=0;i<a.length;i++) {
//			if(e==a[i]) {
//				flag=1;
//				//System.out.println("element found");
//				break;
//			}
//		}
//		if(flag==1) {
//			System.out.println("Element found");
//		}
//		else 
//			System.out.println("Element Not found");
	}

}
