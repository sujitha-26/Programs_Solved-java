package pattern;

public class charPattern {

	public static void main(String[] args) {
		char ch,c;
		int n=5;
		
		System.out.println("odd a even A");
		System.out.println();
		for(int i=1;i<=n;i++) 
		{
			ch='A'; c='a';
			
			for(int j=1;j<=n;j++) {
				if(i%2==0) {
				System.out.print(c+" ");
				}
				else {
					System.out.print(ch+" ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("printing char");
		System.out.println();
		for(int i=1;i<=n;i++) 
		{
			ch='A';
			for(int j=1;j<=n;j++) {
				System.out.print(ch+" ");
				
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("printing char orderly");
		System.out.println();
		for(int i=1;i<=n;i++) 
		{
			ch='A';
			for(int j=1;j<=n;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("printing left upper");
		System.out.println();
		for(int i=1;i<=n;i++) 
		{
			ch='A';
			for(int j=1;j<=n;j++) {
				if(i>=j) {
				System.out.print(ch+" ");
				ch++;
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("printing left down");
		System.out.println();
		for(int i=1;i<=n;i++) 
		{
			ch='A';
			for(int j=1;j<=n;j++) {
				if(i+j<=n+1) {
				System.out.print(ch+" ");
				ch++;
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("printing right upper");
		System.out.println();
		ch='W';
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++) 
			{
				if(i+j>=n+1) 
				{
				System.out.print(ch+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			ch++;
			System.out.println();
		}
		
		System.out.println();
		System.out.println("printing right upper");
		System.out.println();
		ch='A';
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++) 
			{
				if(i+j>=n+1) 
				{
				System.out.print(ch+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			ch=(char)(ch+2);
			System.out.println();
		}
		
		System.out.println();
		System.out.println("printing right down");
		System.out.println();
		ch='A';
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++) 
			{
				if(i<=j) 
				{
				System.out.print(ch+" ");
				ch=(char)(ch+2);
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Diamond");
		System.out.println();
		char ch1='A';
		for(int i=1;i<=n*2-1;i++) 
		{
			for(int j=1;j<=n*2-1;j++) 
			{
				if(i+j>=n+1&&j-i<=n-1&&i-j<=n-1&&i+j<=n*3-1) {
					System.out.print(ch1+" ");
					
				}
				else {
					System.out.print("  ");
				}
				
			}
			if(i<=n) {
				ch1++;
			}
			else
			{
				ch1--;
			}
			System.out.println();
		}
		
	
	}

}
