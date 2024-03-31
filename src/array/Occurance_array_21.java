package array;

public class Occurance_array_21 {

	public static void main(String[] args) {
		int a[]= {3,4,5,3,5,6,7,6,6,6,5};
		for(int i=0;i<a.length;i++) {
			int ele=a[i];
			int count=1;
			for(int j=i+1;j<a.length;j++) 
			{
				if(ele==a[j])
				{
					count++;
					a[j]=Integer.MIN_VALUE;
					//a[j]=Integer.MAX_VALUE;
				}
			}
			if(a[i]!=Integer.MIN_VALUE) {
			System.out.println(ele+"==>"+count);
			}
		}

	}

}
