package string;

public class Primechar_Instring_25 {

	public static void main(String[] args) {
		String str="applefdgdr2";
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++) 
		{
			char ch=arr[i]; 
			int c=(int)ch;
			int count=1;
			for(int j=2;j<=c;j++) {
				if(c%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("int is: "+c+" char is: "+ch);
			}
			
		}

	}

}
