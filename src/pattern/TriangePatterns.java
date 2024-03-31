package pattern;

public class TriangePatterns {

	public static void main(String[] args) {
		int n=4;
		
		System.out.println("left upper triangle;");
		System.out.println();
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++) {
				if(i>=j) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		System.out.println("right uppertriangle;");
		System.out.println();
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++) {
				if(i+j>=n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("left down triangle;");
		System.out.println();
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++) {
				if(i+j<=n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("right down triangle;");
		System.out.println();
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++) {
				if(i<=j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("right&left down triangle;");
		System.out.println();
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n*2-1;j++) {
				if(i>=j||i+j>=n*2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		
		System.out.println("right&left upper triangle;");
		System.out.println();
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n*2-1;j++) {
				if(i+j<=n+1 || j-i>=n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("full ");
		System.out.println();
		for(int i=1;i<=n*2-1;i++) 
		{
			for(int j=1;j<=n*2-1;j++) {
				if(i+j<=n+1|| j-i>=n-1 || i-j>=n-1 || i+j>=n*3-1 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("upper pyramid ");
		System.out.println();
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n*2-1;j++) {
				if(i+j>=n+1 &&j-i<=n-1 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("left pyramid ");
		System.out.println();
		for(int i=1;i<=n*2-1;i++) 
		{
			for(int j=1;j<=n;j++) {
				if(i>=j&&i+j<=n*2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("right pyramid ");
		System.out.println();
		for(int i=1;i<=n*2-1;i++) 
		{
			for(int j=1;j<=n;j++) {
				if(i+j>=n+1 && i-j<=n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("santaglass ");
		System.out.println();
		for(int i=1;i<=n*2-1;i++) 
		{
			for(int j=1;j<=n*2-1;j++) {
				if((i+j>=n*2 && i>=j) || (i+j<=n*2 && i<=j)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
	}

}
