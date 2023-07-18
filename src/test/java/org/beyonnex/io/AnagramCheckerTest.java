package org.beyonnex.io;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {
    @Test
    @DisplayName("Given anagram words as listen and silent, when checking are anagrams, then return true.")
    void givenAnagramWords_whenCheckingAreAnagrams_thenReturnTrue() {
        // Given
        String word1 = "listen";
        String word2 = "silent";

        // When
        boolean result = AnagramChecker.areAnagrams(word1, word2);

        // Then
        assertTrue(result);
    }

    @Test
    @DisplayName("Given non-anagram words as hello and world, when checking are anagrams, then return false.")
    void givenNonAnagramWords_whenCheckingAreAnagrams_thenReturnFalse() {
        // Given
        String word1 = "hello";
        String word2 = "world";

        // When
        boolean result = AnagramChecker.areAnagrams(word1, word2);

        // Then
        assertFalse(result);
    }

    @Test
    @DisplayName("Given anagram words with different case as LISTEN and silent, when checking are anagrams, then return true.")
    void givenAnagramWordsWithDifferentCase_whenCheckingAreAnagrams_thenReturnTrue() {
        // Given
        String word1 = "LISTEN";
        String word2 = "silent";

        // When
        boolean result = AnagramChecker.areAnagrams(word1, word2);

        // Then
        assertTrue(result);
    }

    @Test
    @DisplayName("Given anagram words with non-alphabetic characters as 'debit card' and 'bad credit', when checking are anagrams, then return true.")
    void givenAnagramWordsWithNonAlphabeticCharacters_whenCheckingAreAnagrams_thenReturnTrue() {
        // Given
        String word1 = "debit card";
        String word2 = "bad credit";

        // When
        boolean result = AnagramChecker.areAnagrams(word1, word2);

        // Then
        assertTrue(result);
    }

    @Test
    @DisplayName("Given anagram words with different lengths as listen and silently, when checking are anagrams, then return false.")
    void givenAnagramWordsWithDifferentLengths_whenCheckingAreAnagrams_thenReturnFalse() {
        // Given
        String word1 = "listen";
        String word2 = "silently";

        // When
        boolean result = AnagramChecker.areAnagrams(word1, word2);

        // Then
        assertFalse(result);
    }
}
