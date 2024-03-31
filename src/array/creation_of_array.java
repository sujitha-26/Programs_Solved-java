package array;

public class creation_of_array {

	public static void main(String[] args) {
		//by new
		int a[]=new int[4];
		//without new
		int b[]= {23,45,66,78};
		
		a[0]=6;
		a[1]=87;
		a[2]=56;
		a[3]=23;
		//a[-1]=9;=>AIOOFBE
		//a[4]
		//a[9]
		
		System.out.println(a);
		System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]);
		
		System.out.println(b);
		System.out.println(b[0]+" "+b[1]+" "+b[2]+" "+b[3]);
	}

}
