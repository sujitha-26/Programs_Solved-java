package pattern;

public class printingStar_in1stRow1StColoumLastRow {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) 
		{
			for(int j=1;j<=4;j++) 
			{
				if((i==1) || (j==1) ||(i==4)) 
				{
					System.out.print("* ");
				}
//				else if(j==1)
//				{
//					System.out.print("* ");
//				}
//				else if(i==4) {
//					System.out.print("* ");
//				}
				
			}
			System.out.println();
		}
	}
}
