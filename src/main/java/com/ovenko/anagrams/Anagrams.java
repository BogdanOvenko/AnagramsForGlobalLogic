package com.ovenko.anagrams;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    public static boolean isAnagrams(String firstString, String secondString) {

        if(firstString.length() != secondString.length()){
            throw new RuntimeException("strings are not anagrams");
        }
        if(firstString.equals(secondString)){
            return true;
        }

        int stringsLength = firstString.length();

        Map<Character, Integer> firstStringMap = new HashMap<Character, Integer>();
        Map<Character, Integer> secondStringMap = new HashMap<Character, Integer>();
        char[] firstStringCharArray = firstString.toCharArray();
        char[] secondStringCharArray = secondString.toCharArray();

        for(int i = 0; i < stringsLength; i++) {
            if(!firstStringMap.containsKey(firstStringCharArray[i])) {
                firstStringMap.put(firstStringCharArray[i], 1);
            } else {
                int count = firstStringMap.get(firstStringCharArray[i]);
                firstStringMap.put(firstStringCharArray[i], count++);
            }
            if(!secondStringMap.containsKey(secondStringCharArray[i])) {
                secondStringMap.put(secondStringCharArray[i], 1);
            } else {
                int count = secondStringMap.get(secondStringCharArray[i]);
                secondStringMap.put(secondStringCharArray[i], count++);
            }
        }

        return firstStringMap.equals(secondStringMap);
    }

    public static void checkAnagrams(String firstString, String secondString) {
        if(isAnagrams(firstString, secondString)) {
            System.out.println("Strings: \"" + firstString + "\" and \"" + secondString + "\" are anagrams");
        } else {
            System.out.println("Strings: \"" + firstString + "\" and \"" + secondString + "\" are not anagrams");
        }
    }
}
