package array;

public class avg_foroddEven_index_7 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int sum=0,count=0;
		for(int i=0;i<=a.length;i++) {
			if(i%2!=0) {
				count++;
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
		System.out.println(sum/count);
	}

}
