/**
 * Created by weiyao on 2/4/17.
 */
public class Palindrome {

    public static boolean isPalindrome(String input) {
            if (input == null || input.isEmpty()) {
                return false;
            }

            String temp = input.replaceAll("\\W", "").trim().toLowerCase();

            int tempLength = temp.length();

            for (int i = 0; i < tempLength/2; i++ ) {
                if(temp.charAt(i) != temp.charAt(tempLength-1-i)) {
                    return false;
                }
            }

            return true;

    }


}
