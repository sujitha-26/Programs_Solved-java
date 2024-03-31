package pattern;

public class class_2to4_numPattern {

	public static void main(String[] args) {
		int n=4;
		System.out.println("1)......");
		for(int i=1;i<=n*2-1;i++)
		{
			for(int j=1;j<=n*2-1;j++) 
			{
				if(i+j>=n+1 && j-i<=n-1 && i-j<=n-1 && i+j<=n*3-1) {
					System.out.print(i+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("2)......");
		for(int i=1;i<=n*2-1;i++)
		{
			for(int j=1;j<=n*2-1;j++) 
			{
				if(i+j==n+1 || j-i==n-1 || i-j==n-1 || i+j==n*3-1) {
					System.out.print(i+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("3)......");
		char ch='A';
		for(int i=1;i<=n*2-1;i++) 
		{
			ch='A';
			for(int j=1;j<=n;j++) {
				if(i>=j && i+j<=n*2) {
					System.out.print(ch+" ");
					ch++;
				}
			}
			System.out.println();
		}
		
		System.out.println("4)....");
		for(int i=1;i<=n*2-1;i++) 
		{
			int num=1,num2=i;
			for(int j=1;j<=n;j++) 
			{
				if(i+j<=n+1) {
					System.out.print(num+" ");
					num++;
				}
				else if(j-i>=n-1) {
					System.out.print(num2+" ");
					num2++;
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("5)....");
		for(int i=1;i<=n;i++) 
		{
			
			int num=1,num2=i;
			
			for(int j=1;j<=n*2-1;j++) 
			{
				if(i>=j && i+j!=n*2) {
					System.out.print(num+" ");
					num++;
				}
				else if(i+j>=n*2) {
					System.out.print(num2+" ");
					num2--;
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("6)......");
		int n1=4,num=1;
	
		for(int i=1;i<=n1*2-1;i++)
		{
			
			for(int j=1;j<=n1*2-1;j++) 
			{
				if(i+j>=n1+1 && j-i<=n1-1 && i-j<=n1-1 && i+j<=n1*3-1) {
					System.out.print(num+" ");
					
				}
				else {
					System.out.print("  ");
				}
			}
			if(i<n1) {
				num++;
			}
			else {
				num--;
			}
			System.out.println();
		}
		
		System.out.println("===========");
		int n2=5;
		for(int i=1;i<=n2*2-1;i++) {
			for(int j=1;j<=n2*2-1;j++) {
				if(i==n2|| j==n2 || (i==1&&j<=n2) ||(j==n2*2-1 && i<=n2) ||(j==1 && i>=n2) || (i==n2*2-1&& j>=n2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("===========");
		n=4;
		num=1;
		for(int i=1;i<=n;i++) 
		{
			num=i;
			for(int j=1;j<=n*2-1;j++) 
			{
				if(i+j>=n+1 && j-i<=n-1) 
				{
					System.out.print(num+" ");
					if(j<n){
						num--;
					}
					else {
						num++;
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		
		

	}

}































//if(j<=n) 
//{
//	System.out.print(num+" ");
//	num--;
//	
//}
//else if(j>=n) {
//	System.out.print(num+" ");
//}
//
//}
//else 
//{
//System.out.print("  ");
//}
