package pattern;

public class printingStarIn_1stRowAndColoum {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) 
		{
			for(int j=1;j<=4;j++) 
			{
				if(j==1) 
				{
					System.out.print("* ");
					
				}
				else if(i==1) 
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

}
