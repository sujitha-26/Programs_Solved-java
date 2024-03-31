package string;
import java.util.Arrays;
public class AsciiValue_inSameIndex_7 {

	public static void main(String[] args) {
		String str="apple";
		//System.out.println(str);
		int a[]=new int[str.length()];
		for(int i=0;i<str.length();i++) 
		{
			char ch=str.charAt(i);
			System.out.print(ch+" ");
			a[i]=(int)ch;
			
		}
		System.out.println();
		System.out.println(Arrays.toString(a));
	}

}
