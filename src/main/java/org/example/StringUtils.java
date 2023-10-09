package org.example;
import java.util.Arrays;

public class StringUtils {

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String sortAlphabetically(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static int countLetters(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    public static String removeLetter(String word, char letter) {
        return word.replace(String.valueOf(letter), "");
    }

    public static void printLettersInNextLine(String word) {
        for (char c : word.toCharArray()) {
            System.out.println(c);
        }
    }

    public static boolean findIfItsPair(String a) {
        return a.length() % 2 == 0 ; // This may throw an ArithmeticException
    }
}
