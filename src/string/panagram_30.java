package string;

import java.util.Arrays;

public class panagram_30 {
	public static void main(String[] args) {
		String str="aaaccdefghhij45klmnopqrr@stuvwwxyz";
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[j]='=';
				}
			}
			
		}
		//System.out.println(Arrays.toString(arr));
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>='a'&&arr[i]<='z') {
				count++;
			}
		}
		System.out.println("count is:"+count);
		if(count==26) {
			System.out.println("Panagram");
		}
		else {
			System.out.println("not panagram");
		}
	}
}
