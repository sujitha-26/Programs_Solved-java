package numberPrgs;

public class num_AmstrongNum_30 {

	public static void main(String[] args) {
		int num=3791,i,count=0,rem,pow=1,sum=0,temp=num;
		
		//to find count
		for(;num!=0;) 
		{
			rem=num%10;
			count++;
			num=num/10;
		}
		System.out.println("count of given num is: "+count);
		
		//pow of each digit and sum
		
		for(num=temp;num!=0;num=num/10) 
		{
			rem=num%10;
			pow=1;
			for(i=1;i<=count;i++) {
				pow=pow*rem;
			}
			sum=sum+pow;
			//System.out.println(sum);	
		}
		//System.out.println(temp);
		if(sum==temp) {
			System.out.println("Amstrong");
		}
		else {
			System.out.println("Not Amstrong");
		}

	}

}
