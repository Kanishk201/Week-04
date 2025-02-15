package junittesting.basiicjunittesting.stringutilitytesting;

import static org.junit.jupiter.api.Assertions.*;

import junitproblems.basicjunitproblems.stringutility.StringUtils;
import org.junit.jupiter.api.Test;


public class StringUtilsTest {
    private final StringUtils stringUtils = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("olleH", stringUtils.reverse("Hello"));
        assertEquals("321", stringUtils.reverse("123"));
        assertNull(stringUtils.reverse(null));
        assertEquals("", stringUtils.reverse(""));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("madam"));
        assertTrue(stringUtils.isPalindrome("Racecar"));
        assertFalse(stringUtils.isPalindrome("Hello"));
        assertFalse(stringUtils.isPalindrome(null));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
        assertEquals("WORLD", stringUtils.toUpperCase("World"));
        assertNull(stringUtils.toUpperCase(null));
        assertEquals("", stringUtils.toUpperCase(""));
    }
}

