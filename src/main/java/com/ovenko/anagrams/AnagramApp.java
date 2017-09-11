package com.ovenko.anagrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnagramApp {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        String second = reader.readLine();
        checkAnagrams(first, second);
    }

    public static void checkAnagrams(String first, String second) {
        if(Anagram.isAnagram(first, second)) {
            System.out.println("Strings: \"" + first + "\" and \"" + second + "\" are anagrams");
        } else {
            System.out.println("Strings: \"" + first + "\" and \"" + second + "\" are not anagrams");
        }
    }
}
