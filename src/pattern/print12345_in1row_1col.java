package pattern;

public class print12345_in1row_1col {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) 
		{
		
			for(int j=1;j<=5;j++) 
			{
				if(i==1)
				{
				System.out.print(j+" ");
				}
				else if(j==1)
				{
					System.out.print(i);
				}
			}
			System.out.println();
		}

	}

}
