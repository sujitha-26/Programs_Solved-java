package array;

public class eachNum_primeOrNot_10 {

	public static void main(String[] args) {
		int a[]= {2,5,11,12,15,73};
		for(int i=0;i<a.length;i++) 
		{
			int n=a[i];
			int count=0;
			for(int j=1;j<=n;j++) 
			{
				if(n%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(n);
			}
		}
	}

}
