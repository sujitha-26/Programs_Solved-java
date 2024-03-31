package pattern;

public class arrowPrinting {

	public static void main(String[] args) {
		int n=4;
		
		System.out.println("----------left Upward arrow mark:-----------");
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++) 
			{
				if(i==1 || j==1 || i==j) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("----------Right Upward arrow mark:-----------");
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || j==n || i+j==n+1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("----------Right downward arrow mark:-----------");
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++)
			{
				if(i==n || j==n || i==j) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("----------left downward arrow mark:-----------");
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++)
			{
				if(i==n || j==1 || i+j==n+1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
