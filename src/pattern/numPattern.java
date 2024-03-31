package pattern;

public class numPattern {

	public static void main(String[] args) {
		int n=4;
		System.out.println("----------1----------");
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++) {
				System.out.print(n+" ");
			};
			System.out.println();
		}
		
		System.out.println("----------2----------");
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++) {
				if(i==1 || i==3) {
					//i%2!=0
				System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		System.out.println("----------3----------");
		for(int i=1;i<=n;i++) 
		{
			
			for(int j=1;j<=n;j++) 
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=n;i++) 
		{
			
			for(int j=1;j<=n;j++) 
			{
				if(i>=j)
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
		System.out.println("----------4----------");
		int num=4;
		for(int i=1;i<=n;i++) 
		{
			
			for(int j=1;j<=n;j++) 
			{
				if(i+j<=n+1) 
				{
					System.out.print(num+" ");
					num--;
				}
			}
			num=4;
			System.out.println();
		}
		
		System.out.println("----------5----------");
		num=9;
		for(int i=1;i<=n;i++) 
		{
			
			for(int j=1;j<=n;j++) 
			{
				if(i+j>=n+1) 
				{
				System.out.print(num+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			num--;
			System.out.println();
		}
		
		System.out.println("----------6----------");
		num=5;
		for(int i=1;i<=n;i++) 
		{
			
			for(int j=1;j<=n;j++) 
			{
				if(i<=j) 
				{
				System.out.print(num+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			num--;
			System.out.println();
		}
		
		System.out.println("----------7----------");
		num=1;
		n=5;
		for(int i=1;i<=n;i++) 
		{
			
			for(int j=1;j<=n*2-1;j++) 
			{
				if(i+j>=n+1 && j-i<=n-1) 
				{
				System.out.print(num+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			num++;
			System.out.println();
		}
		
		System.out.println("----------8----------");
		num=1;
		n=5;
		for(int i=1;i<=n;i++) 
		{
			
			for(int j=1;j<=n*2-1;j++) 
			{
				
				if(i+j>=n+1 && j-i<=n-1 && (i+j)%2==0) 
				{
				System.out.print(num+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			num++;
			System.out.println();
		}
		
		System.out.println("----------9----------");
		
		n=4;
		for(int i=1;i<=n;i++) 
		{
			num=i;
			for(int j=1;j<=n*2-1;j++) 
			{
				//left
				if(i+j>=n+1 && j-i<=n-1) 
				{
//					if(j<=n) 
//					{
//						System.out.print(num+" ");
//						num--;
//						
//					}
					
				}
				else 
				{
					System.out.print("  ");
				}
				
				//right
//				if(i+j>=n+1 && j-i<=n-1) 
//				{
//					if(j>=n) {
//						System.out.print(num+" ");
//						num++;
//					}
//				}
//				else {
//					System.out.print("  ");
//				}
				
			}
			System.out.println();
			
		}
		
		System.out.println("=================");
		int num1=5;
		for(int i=1;i<=num1;i++) 
		{
			int row=i;
			for(int j=1;j<=num;j++) {
				if(row<=9) {
					System.out.print(" ");
				}
				System.out.print(row+" ");
				row=row+4;
				
			}
			System.out.println();
			
		}
		System.out.println("=====================");
		num=1;
		n=5;
		for(int i=1;i<=n;i++) 
		{
			
			for(int j=1;j<=n*2-1;j++) 
			{
				if(i+j>=n+1 && j-i<=n-1) 
				{
				System.out.print(num+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			num++;
			System.out.println();
		}
		
		
		
	}

}
