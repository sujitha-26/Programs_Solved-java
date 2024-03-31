package string;

public class count_space_8 {

	public static void main(String[] args) {
		System.out.println("======count of space=======");
		String s2="   hello  world   ";
		int count=0;
		for(int i=0;i<s2.length();i++) {
			char ch=s2.charAt(i);
			if(ch==' ') 
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
