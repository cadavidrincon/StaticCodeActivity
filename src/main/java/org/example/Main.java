package org.example;

import lombok.extern.java.Log;

import java.util.Scanner;

@Log
public class Main {
    public static void main(String[] args) {
        log.info("Hello world!");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            log.info("Choose an operation:");
            log.info("1. Check if a word is a palindrome");
            log.info("2. Sort the letters of a word");
            log.info("3. Count the amount of letters in a word");
            log.info("4. Remove a given letter from a word");
            log.info("5. Print letters in next line from a word");
            log.info("6. Print letters in next line from a word");
            log.info("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    log.info("Enter a word:");
                    String word = scanner.nextLine();
                    boolean isPalindrome = StringUtils.isPalindrome(word);
                    log.info("Is it a palindrome? " + isPalindrome);
                    break;
                case 2:
                    log.info("Enter a word:");
                    String wordToSort = scanner.nextLine();
                    String sortedWord = StringUtils.sortAlphabetically(wordToSort);
                    log.info("Sorted word: " + sortedWord);
                    break;
                case 3:
                    log.info("Enter a word:");
                    String wordToCount = scanner.nextLine();
                    int letterCount = StringUtils.countLetters(wordToCount);
                    log.info("Letter count: " + letterCount);
                    break;
                case 4:
                    log.info("Enter a word:");
                    String wordToRemoveFrom = scanner.nextLine();
                    log.info("Enter a letter to remove:");
                    char letterToRemove = scanner.nextLine().charAt(0);
                    String wordAfterRemoval = StringUtils.removeLetter(wordToRemoveFrom, letterToRemove);
                    log.info("Word after removal: " + wordAfterRemoval);
                    break;
                case 5:
                    log.info("Enter a word:");
                    String wordToPrint = scanner.nextLine();
                    StringUtils.printLettersInNextLine(wordToPrint);
                    break;
                case 6:
                    log.info("Enter a word:");
                    String wordToCheck = scanner.nextLine();
                    StringUtils.findIfItsPair(wordToCheck);
                    boolean isPair = StringUtils.findIfItsPair(wordToCheck);
                    log.info("Is it Pair? " + isPair);
                    break;
                case 0:
                    log.info("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    log.info("Invalid choice. Please choose a valid option.");
            }
        }


    }



}