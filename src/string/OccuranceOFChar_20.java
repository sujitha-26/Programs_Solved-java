package string;

import java.util.Arrays;

public class OccuranceOFChar_20 {

	public static void main(String[] args) {
		String str="hello";
		char ch[]=str.toCharArray();
		char c;
		int count=1,flag=0,j;
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++) 
		{
			c=ch[i];
			count=1;
			for(j=i+1;j<ch.length;j++) 
			{
				if(c==ch[j]) {
					count++;
					ch[j]=Character.MAX_VALUE;
				}
			}
			if(ch[i]!=Character.MAX_VALUE)
				System.out.println(c+"==>"+count);
		}

	}

}
