import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by weiyao on 2/4/17.
 */
@RunWith(Arquillian.class)
public class PalindromeTest {
    @Test
    public void isPalindrome()  {
        String str = "   Hello ? =!  -olleh";

        assertEquals(Palindrome.isPalindrome(str), true);

    }





}
