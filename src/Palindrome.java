/**
 * This class contains a static tool to check if a string is palindrome or not.
 */
public class Palindrome {

    /**
     * This method will ignore input with white spaces. It will only recognize numbers and letters in case-insensitive manner.
     * @param input a string
     * @return true if input is palindrome
     */
    public static boolean isPalindrome(String input) {
        //input is null, throw exception
        if (input == null)  {
                throw new IllegalArgumentException();
        }

        //remove all white space
        String temp = input.replaceAll(" ", "").trim().toLowerCase();

        //check for punctuation marks
        if (temp.matches(".*[^a-zA-Z0-9].*")) {
            return false;
        }

        //check for palindrome
        int tempLength = temp.length();

        for (int i = 0; i < tempLength/2; i++ ) {
            if(temp.charAt(i) != temp.charAt(tempLength-1-i)) {
                return false;
            }
        }

        return true;

    }


}
