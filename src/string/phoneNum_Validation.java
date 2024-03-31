package string;

public class phoneNum_Validation {

	public static void main(String[] args) {
		//length==10;
		//only number should use
		//first number should be 6-9
		
		String number="93448378.5";
		int flag=1;
		if(number.length()==10) 
		{
			if(number.charAt(0)>='6' && number.charAt(0)<='9') {
				//flag =1;
				for(int i=1;i<number.length();i++) {
					if(number.charAt(i)>='0' && number.charAt(i)<='9') {

					}
					else {
						flag=0;
						break;
					}
				}
			}
			else {
				System.out.println("First number should start with 6-9");
				flag=0;
			}
		}
		else {
			System.out.println("Number length should be 10");
			flag=0;
		}
		if(flag==1) {
			System.out.println("valid number");
		}
		else {
			System.out.println("Invalid number");
		}
	}

}
