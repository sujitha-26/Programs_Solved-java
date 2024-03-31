package array;
import java.util.Arrays;
public class palindrome_14 {

	public static void main(String[] args) {
		int a[]= {1,2,3,3,3,3,2,1,0};
		int i,j=a.length-1,flag=0;
		for(i=0;i<=a.length/2;i++) {
			//System.out.println(a.length/2);
			if(a[i]==a[j]) {
				j--;
			}
			else {
				flag=1;
				System.out.println("Not palindrome");
				break;
			}
			
		}
		if(flag==0) {
			System.out.println(Arrays.toString(a)+" : is palindrome");
		}
		

	}

}
