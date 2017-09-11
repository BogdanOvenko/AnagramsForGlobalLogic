package com.ovenko.anagrams;

import org.junit.Test;
import static junit.framework.Assert.*;

public class AnagramsTest {

    @Test
    public void isAnagramTrueTest() {
        String s1 = "adds";
        String s2 = "sdda";
        assertTrue(Anagrams.areAnagrams(s1, s2));
    }

    @Test
    public void isAnagramFalseTest() {
        String s1 = "adda";
        String s2 = "sdda";
        assertFalse(Anagrams.areAnagrams(s1, s2));
    }

    @Test(expected = RuntimeException.class)
    public void  isAnagramDifferentLengthInputTest() {
        String s1 = "addas";
        String s2 = "sdda";
        Anagrams.areAnagrams(s1, s2);
    }
}
