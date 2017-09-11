package com.ovenko.anagrams;


public class AnagramApp {

    public static void main(String[] args) {

        checkAnagrams("elmmmis", "limmmes");
    }

    public static void checkAnagrams(String first, String second) {
        if(Anagrams.areAnagrams(first, second)) {
            System.out.println("Strings: \"" + first + "\" and \"" + second + "\" are anagrams");
        } else {
            System.out.println("Strings: \"" + first + "\" and \"" + second + "\" are not anagrams");
        }
    }
}
