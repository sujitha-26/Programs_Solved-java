package array;

import java.util.Arrays;
import java.util.Scanner;

public class userInput_array_andPrinting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("size");
		int size=sc.nextInt();
		
		System.out.println("elements");
		int a[]=new int[size];
		System.out.println(size);
		for(int i=0;i<a.length;i++) {			
			a[i]=sc.nextInt();	
		}
		System.out.println(Arrays.toString(a));
//		for(int i=0;i<a.length;i++) {
// 		System.out.println(a[i]);
//		}
		
		
		
	}

}
