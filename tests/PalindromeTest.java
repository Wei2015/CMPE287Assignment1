
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * This test program contain five test cases.
 */
public class PalindromeTest {

    @Test
    public void punctuationMark() throws Exception {

        for (int i = 33; i < 127; i++) {
            String str = Character.toString((char)i);
            if (!str.matches("[a-zA-Z0-9]")) {
                str = "hello"  + Character.toString((char)i) + "olleh";
                assertFalse(Palindrome.isPalindrome(str));
            }
        }
    }

    @Test
    public void whiteSpace() throws Exception {
        String str = "   hello   olleh   ";
        assertTrue(Palindrome.isPalindrome(str));
    }

    @Test
    public void caseSensitive() {
        String str = "aBcCBA";
        assertTrue(Palindrome.isPalindrome(str));

    }

    @Test
    public void numberTest() throws Exception {
        String str = "123832";
        assertFalse(Palindrome.isPalindrome(str));

        str = "12321";
        assertTrue(Palindrome.isPalindrome(str));

    }

    @Test
    public void emptyString() throws Exception {
        String str = "";
        assertTrue(Palindrome.isPalindrome(str));
    }

    @Test (expected = IllegalArgumentException.class)
    public void nullInput() throws Exception {
        String str = null;
        Palindrome.isPalindrome(str);
    }





}
