package com.ovenko.anagrams;

public class AnagramApp {

    public static void main(String[] args) {
        checkAnagrams(args[0], args[1]);
    }

    public static void checkAnagrams(String first, String second) {
        if(Anagram.isAnagram(first, second)) {
            System.out.println("Strings: \"" + first + "\" and \"" + second + "\" are anagrams");
        } else {
            System.out.println("Strings: \"" + first + "\" and \"" + second + "\" are not anagrams");
        }
    }
}
