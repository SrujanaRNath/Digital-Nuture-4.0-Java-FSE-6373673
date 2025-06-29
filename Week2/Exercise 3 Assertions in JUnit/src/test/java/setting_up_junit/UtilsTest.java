package setting_up_junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {

    Utils utils = new Utils();

    @Test
    public void testReverse() {
        assertEquals("tac", utils.reverse("cat"));
        assertNotEquals("dog", utils.reverse("god"));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(utils.isEmpty(""));
        assertTrue(utils.isEmpty(null));
        assertFalse(utils.isEmpty("abc"));
    }
}
