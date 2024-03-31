package array;

public class smallestInArray_16 {

	public static void main(String[] args) {
		int[] a= {34,22,0,-10,-6,6,10};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Smallest in array: "+min);

	}

}
