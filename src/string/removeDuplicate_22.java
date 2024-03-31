package string;

public class removeDuplicate_22 {

	public static void main(String[] args) {
		String str="haia hello siva";
		char[] a=str.toCharArray();
		int count=1,j;
		for(int i=0;i<a.length;i++) 
		{
			char ch=a[i];
			count=1;
			for(j=i+1;j<a.length;j++)
			{
				if(ch==a[j]) {
					count++;
					a[j]=Character.MAX_VALUE;
					
				}
			}
			if(a[i]!=Character.MAX_VALUE && count==1) {
				System.out.println(ch+"==>"+count);
			}
		}
		
	}

}
