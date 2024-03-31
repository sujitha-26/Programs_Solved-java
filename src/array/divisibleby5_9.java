package array;

public class divisibleby5_9 {
	public static void main(String[] args) {
		int a[]= {2,5,7,10,11,25,40};
		for(int i=0;i<a.length;i++) {
			if(a[i]%5==0) {
				System.out.println(a[i]);
			}
		}
	}
}
