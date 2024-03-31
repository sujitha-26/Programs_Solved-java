package string;

public class demo {

	public static void main(String[] args) {
		String str = "java is programming language";
        String st[] = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < st.length; i++) {
            String word = st[i];

            if (word.length() > 0) {
                char firstChar = word.charAt(0);

                if (firstChar >= 'a' && firstChar <= 'z') {
                    char capitalizedChar = (char) (firstChar - 32);
                    result.append(capitalizedChar);
                    result.append(word.substring(1));  // append the rest of the word
                } else {
                    result.append(word);
                }

                if (i < st.length - 1) {
                    result.append(" ");  // add space between words
                }
            }
        }

        System.out.println(result.toString());

	}

}
