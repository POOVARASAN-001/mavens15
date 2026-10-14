package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testIsPalindrome() {
        App app = new App();
        assertTrue(app.isPalindrome("racecar"));
        assertTrue(app.isPalindrome("Kayak"));
        assertFalse(app.isPalindrome("software"));
    }

    @Test
    public void testEmptyAndNull() {
        App app = new App();
        assertTrue(app.isPalindrome(""));
        assertFalse(app.isPalindrome(null));
    }
}
