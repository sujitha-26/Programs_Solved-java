package operatos;

public class largest3Num {

	public static void main(String[] args) {
		int a=90;
		int b=20;
		int c=130;
		
		System.out.println(((a>b)&&(a>c))?"a is greater":((b>a)&&(b>c))?"b is greater":"c is greater");
		
		//another method:(without logical)
		int res=((a>b)? (a>c)?a:c :(b>c)?b:c);

	}

}
