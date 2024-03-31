package string;

import java.util.Arrays;

public class MinLength_OfWords_27 {

	public static void main(String[] args) {
		String str="hai hello hi s welcome";
		String arr[]=str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		String min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()<min.length()) {
				min=arr[i];
			}
		}
		System.out.println(min+"\nLength is: "+min.length());
	}

}
