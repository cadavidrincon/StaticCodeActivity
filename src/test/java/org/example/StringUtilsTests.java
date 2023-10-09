package org.example;

import org.example.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTests {

    @Test
    public void testIsPalindromeHighComplexity() {
        assertTrue(StringUtils.isPalindrome("racecar"));
        assertFalse(StringUtils.isPalindrome("hello"));
    }

    @Test
    public void testSortAlphabetically() {
        assertEquals("aacehllorsttt", StringUtils.sortAlphabetically("strollacethat"));
        assertEquals("abcdefg", StringUtils.sortAlphabetically("gfedcba"));
        assertEquals("123456789", StringUtils.sortAlphabetically("987654321"));
    }

    @Test
    public void testCountLetters() {
        assertEquals(5, StringUtils.countLetters("Hello"));
        assertEquals(4, StringUtils.countLetters("123abcd"));
    }

    @Test
    public void testRemoveLetter() {
        assertEquals("Hllo", StringUtils.removeLetter("Hello", 'e'));
        assertEquals("bcdefg", StringUtils.removeLetter("abcdefg", 'a'));
        assertEquals("1235", StringUtils.removeLetter("12345", '4'));
    }

}
