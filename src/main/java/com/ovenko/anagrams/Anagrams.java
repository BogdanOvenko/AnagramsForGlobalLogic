package com.ovenko.anagrams;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    public static boolean areAnagrams(String first, String second) {

        if(first.length() != second.length()){
            throw new RuntimeException("Strings length is not equal. They are not anagrams.");
        }

        int stringsLength = first.length();

        Map<Character, Integer> firstCharsCount = new HashMap<Character, Integer>();
        Map<Character, Integer> secondCharsCount = new HashMap<Character, Integer>();
        char[] firstStringCharArray = first.toCharArray();
        char[] secondStringCharArray = second.toCharArray();

        for(int i = 0; i < stringsLength; i++) {
            if(!firstCharsCount.containsKey(firstStringCharArray[i])) {
                firstCharsCount.put(firstStringCharArray[i], 1);
            } else {
                int count = firstCharsCount.get(firstStringCharArray[i]);
                firstCharsCount.put(firstStringCharArray[i], count++);
            }
            if(!secondCharsCount.containsKey(secondStringCharArray[i])) {
                secondCharsCount.put(secondStringCharArray[i], 1);
            } else {
                int count = secondCharsCount.get(secondStringCharArray[i]);
                secondCharsCount.put(secondStringCharArray[i], count++);
            }
        }

        return firstCharsCount.equals(secondCharsCount);
    }


}
