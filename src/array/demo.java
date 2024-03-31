package array;
import java.util.Arrays;
public class demo {

	public static void main(String[] args) {
//		String str="jerry567";
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(str.length()-1));
	
			
				int a[]={1,2,3,4,7};
				int b[]=new int[a.length+2];
				int j=0,ins=4,ele=5;
				for(int i=0;i<b.length;i++){
				    if(i==4){
				        b[i]=5;
				    }
				    else if(i==5) {
				    	b[i]=6;
				    }
				    else{
				        b[i]=a[j];
				        j++;
				    }
				}
				System.out.println(Arrays.toString(b));
			
	}

}
