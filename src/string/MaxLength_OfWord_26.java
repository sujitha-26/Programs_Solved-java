package string;

public class MaxLength_OfWord_26 {

	public static void main(String[] args) {
		String str="hai si hello welcome  ";
		String arr[]=str.split(" ");
		
		String max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i].length()>max.length()) {
				max=arr[i];
				
			}
			
		}
		System.out.println(max+"\nlength is:"+max.length());

	}

}
