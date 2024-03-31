package array;
import java.util.*;
public class RemoveElement_array_19 {

	public static void main(String[] args) {
		int a[]= {56,78,92,55,10,0,19};
		System.out.println(a.length);
		int remove=92,j=0;
		int c[]=new int[a.length-1];
		System.out.println(c.length);
		for(int i=0;i<a.length;i++) 
		{
			if(remove!=a[i]) {
			c[j]=a[i];
			j++;
			}
		}
		System.out.println(Arrays.toString(c));

	}

}
