
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by weiyao on 2/4/17.
 */
public class PalindromeTest {
    @Test
    public void whiteSpace()  {

        String str = "   Hello ? =!  -olleh";

        assertTrue(Palindrome.isPalindrome(str));
    }

    @Test
    public void caseSensitive() {

        String str = "aBcCBA";

        assertTrue(Palindrome.isPalindrome(str));

    }

    @Test
    public void numberTest() {
        String str = "123832";

        assertFalse(Palindrome.isPalindrome(str));

    }


    @Test
    public void emptyString() {
        String str = "";

        assertFalse(Palindrome.isPalindrome(str));
    }





}
