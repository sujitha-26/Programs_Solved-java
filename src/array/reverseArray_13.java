package array;
import java.util.Arrays;
public class reverseArray_13 {

	public static void main(String[] args) {
		int a[]= {56,78,44,4,6};
		
		//1st way
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		
		//2nd way
		int[] b=new int[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--) {
			b[j]=a[i];
			j++;
		}
		System.out.println("\n"+Arrays.toString(b));

	}

}
