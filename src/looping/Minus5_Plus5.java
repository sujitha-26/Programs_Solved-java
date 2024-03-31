package looping;

public class Minus5_Plus5 {

	public static void main(String[] args) {
		
		System.out.println("negative val");
		for(int i=-5;i<=5;i++) {
			if(i<0) {
				System.out.println(i);
			}
		}
		System.out.println("positive val");
		
		for(int i=-5;i<=5;i++) {
			if(i>0) {
				System.out.println(i);
			}
		}

		System.out.println("positive & even");
		int j=-5;
		while(j<=5) {
			if(j>0 && j%2==0)
				System.out.println(j);
				j++;
		}
		
		System.out.println("negative & even");
		int k=-5;
		while(k<=5) {
			if(k<0 && k%2==0)
				System.out.println(k);
				k++;
		}
		
		System.out.println("positive & odd");
		int j1=-5;
		while(j1<=5) {
			if(j1>0 && j1%2==1)
				System.out.println(j1);
				j1++;
		}
		
		System.out.println("negative & odd");
		int a=-5;
		while(a<=5) {
			if(a<0 && a%2!=0)
				System.out.println(a);
				a++;
		}
		System.out.println("negative & odd");
		int b;
		for(b=-5;b<=5;b++) {
			if(b%2!=0&& b<0) {
				System.out.println(b);
			}
		}
		
		
		/*while
		int i=-5;
		while(i<=5) 
		{
			if(i%2==0 && i>=0)
			{
				System.out.println(i);
			}
		
		i++;
		}*/

/* print negative odd numb by for loop
int i;
for(i=-5;i<=5;i++) {
	//System.out.println(i);
	if(i%2!=0 && i<0){
		System.out.print(i+" ");
	}
}*/


		
	}

}
