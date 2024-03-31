package conditionalStat;

public class ifelse_nested_login {

	public static void main(String[] args) {
		String Mid="suji@gmail.com";
		String pws="123";
		
		if(Mid=="suji@gmail.com")
		{
			if(pws=="123") {
				System.out.println("Login succesfull");
			}
			else
			{
				System.out.println("password invalid");
			}
		}
		else
		{
			System.out.println("Invalid mail id");
		}
			

	}

}
