package com.kashfabbas.stringmanipulation;

import java.util.*;

public class StringUtils {
  public static int countVowels(String str) {
    if (str == null)
      return 0;

    int count = 0;
    String vowels = "aeiou";
    for (var ch : str.toLowerCase().toCharArray())
      if (vowels.indexOf(ch) != -1)
        count++;

    return count;
  }

  public static String reverse(String str) {
    if (str == null)
      return "";

    var reversed = new StringBuilder();
    for (var i = str.length() - 1; i >= 0; i--)
      reversed.append(str.charAt(i));

    return reversed.toString();
  }

  public static String reverseWords(String sentence) {
    if (sentence == null)
      return "";

    String[] words = sentence.trim().split(" ");
    Collections.reverse(Arrays.asList(words));
    return String.join(" ", words);

//    var reversed = new StringBuilder();
//    for (var i = sentence.length() - 1; i >= 0; i--)
//      reversed.append(words[i] + " ");
//
//    return reversed.toString().trim();
  }

//  ABCD -> DABC
//       -> CDAB
//       -> BCDA
//       -> ABCD
//  ABCDABCD
  public static boolean areRotations(String str1, String str2) {
    if (str1 == null || str2 == null) return false;
    return (str1.length() == str2.length()) && (str1 + str1).contains(str2);
  }

  public static String removeDuplicates(String str) {
    if (str == null)
      return "";

    var output = new StringBuilder();
    Set<Character> seen = new HashSet<>();

    for (var ch : str.toCharArray()) {
      if (!seen.contains(ch)) {
        seen.add(ch);
        output.append(ch);
      }
    }

    return output.toString();
  }

  // Most Repeated Char
  public static char getMaxOccuringChar(String str) {
    if (str == null || str.isEmpty())
      throw new IllegalArgumentException();

    final int ASCII_SIZE = 256;
    int[] frequencies = new int[ASCII_SIZE];
    for (var ch : str.toCharArray())
      frequencies[ch]++;

    int max = 0;
    char result = ' ';
    for (var i = 0; i < frequencies.length; i++)
      if (frequencies[i] > max) {
        max = frequencies[i];
        result = (char) i;
      }

    return result;

//    Map<Character, Integer> frequencies = new HashMap<>();
//    for (var ch : str.toCharArray()) {
//      if (frequencies.containsKey(ch))
//        frequencies.replace(ch, frequencies.get(ch) + 1);
//      else
//        frequencies.put(ch, 1);
//    }
  }

  public static String capitalize(String sentence) {
    if (sentence == null || sentence.trim().isEmpty())
      return "";

    String[] words = sentence
                         .trim()
                         .replaceAll(" +", " ")
                         .split(" ");
    for (var i = 0; i < words.length; i++) {
      words[i] = words[i].substring(0, 1).toUpperCase()
               + words[i].substring(1).toLowerCase();
    }

    return String.join(" ", words);
  }

  // O(n log n)
  public static boolean areAnagrams(String first, String second) {
    if (first == null || second == null)
      return false;

    // O(n)
    var array1 = first.toLowerCase().toCharArray();
    // O(n log n)
    Arrays.sort(array1);

    var array2 = second.toLowerCase().toCharArray();
    Arrays.sort(array2);

    return Arrays.equals(array1, array2);
  }

  // Anagrams- Using Histogramming
  // O(n) is faster
  public static boolean areAnagrams2(String first, String second) {
    final int ENGLISH_ALPHABET = 26;
    int[] frequencies = new int[ENGLISH_ALPHABET];

    first = first.toLowerCase();
    // O(n)
    for (var i = 0; i < first.length(); i++)
      frequencies[first.charAt(i) - 'a']++; // 97

    second = second.toLowerCase();
    // O(n)
    for (var i = 0; i < second.length(); i++) {
      var index = second.charAt(i) - 'a';
      if (frequencies[index] == 0)
        return false;

      frequencies[index]--;
    }

    return true;
  }

  public static boolean isPalindrome(String word) {
    if (word == null)
      return false;

    int left = 0;
    int right = word.length() - 1;

    while (left < right)
      if (word.charAt(left++) != word.charAt(right--))
        return false;

    return true;

//    var input = new StringBuilder(word);
//    input.reverse();
//    return input.toString().equals(word);
  }
}
