package string;

import java.util.Arrays;

public class OccuranceOfword_26 {

	public static void main(String[] args) {
		String str="hai hello hai welcome";
		String a[]=str.split(" ");
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i].equals(a[j])) {
					count++;
					a[j]="";
				}
			}
			if(a[i]!="") {
				System.out.println(a[i]+" "+count);
			}
		}
	}

}
