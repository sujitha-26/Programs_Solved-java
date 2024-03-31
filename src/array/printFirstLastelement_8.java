package array;

public class printFirstLastelement_8 {

	public static void main(String[] args) {
		int a[]= {10,20,3,21};
		for(int i=0;i<a.length;i++) {
			if(i==0 || i==a.length-1) {
				System.out.println(a[i]);
			}
		}
		
//		System.out.println(a[0]);
//		System.out.println(a[a.length-1]);

	}

}
