package string;

public class convert_ArrayToString_21 {

	public static void main(String[] args) {
		char ch[]= {'h','e','l','l','o'};
		String str="";
		for(int i=0;i<ch.length;i++) {
			
			str=str+ch[i];
		}
		System.out.println("string is: "+str);
	}

}
