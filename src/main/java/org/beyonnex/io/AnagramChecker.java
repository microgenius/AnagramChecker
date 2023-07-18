package org.beyonnex.io;

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two words as arguments. Example: java AnagramChecker \"word1\" \"word2\"");
            return;
        }

        final String word1 = args[0];
        final String word2 = args[1];

        if (areAnagrams(word1, word2)) {
            System.out.printf("'%s' and '%s' are anagrams.%n", word1, word2);
        } else {
            System.out.printf("The two words are not anagrams. [%s] [%s]%n", word1, word2);
        }
    }

    public static boolean areAnagrams(final String word1, final String word2) {
        // Convert the words to lowercase to ignore case sensitivity
        final String lowerCasedWord1 = word1.toLowerCase();
        final String lowerCasedWord2 = word2.toLowerCase();

        // Check if the lengths of the two words are different
        if (lowerCasedWord1.length() != lowerCasedWord2.length()) {
            return false;
        }

        // Sort the characters of both words
        char[] word1Chars = lowerCasedWord1.toCharArray();
        char[] word2Chars = lowerCasedWord2.toCharArray();
        Arrays.sort(word1Chars);
        Arrays.sort(word2Chars);

        // Compare the sorted character arrays
        return Arrays.equals(word1Chars, word2Chars);
    }
}