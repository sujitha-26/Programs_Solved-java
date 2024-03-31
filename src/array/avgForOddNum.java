package array;

public class avgForOddNum {

	public static void main(String[] args) {
		int s[]= {1,5,1,2,4,8};
		int sum=0,count=0;
		for(int i=0;i<s.length;i++) {
			if(s[i]%2!=0) {
				
				sum=sum+s[i];
				count++;
			}
			
		}
		System.out.println(sum);
		System.out.println(sum/count);
		
	}

}
