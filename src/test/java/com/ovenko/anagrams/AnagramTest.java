package com.ovenko.anagrams;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class AnagramTest {

    @Test
    public void isAnagramTrueTest() {
        String s1 = "adds";
        String s2 = "sdda";
        assertTrue(Anagram.isAnagram(s1, s2));
    }

    @Test
    public void isAnagramFalseTest() {
        String s1 = "adda";
        String s2 = "sdda";
        assertFalse(Anagram.isAnagram(s1, s2));
    }

    @Test(expected = RuntimeException.class)
    public void  isAnagramDifferentLengthInputTest() {
        String s1 = "addas";
        String s2 = "sdda";
        Anagram.isAnagram(s1, s2);
    }
}
