package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Check if a word is a palindrome");
            System.out.println("2. Sort the letters of a word");
            System.out.println("3. Count the amount of letters in a word");
            System.out.println("4. Remove a given letter from a word");
            System.out.println("5. Print letters in next line from a word");
            System.out.println("6. Print letters in next line from a word");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter a word:");
                    String word = scanner.nextLine();
                    boolean isPalindrome = StringUtils.isPalindrome(word);
                    System.out.println("Is it a palindrome? " + isPalindrome);
                    break;
                case 2:
                    System.out.println("Enter a word:");
                    String wordToSort = scanner.nextLine();
                    String sortedWord = StringUtils.sortAlphabetically(wordToSort);
                    System.out.println("Sorted word: " + sortedWord);
                    break;
                case 3:
                    System.out.println("Enter a word:");
                    String wordToCount = scanner.nextLine();
                    int letterCount = StringUtils.countLetters(wordToCount);
                    System.out.println("Letter count: " + letterCount);
                    break;
                case 4:
                    System.out.println("Enter a word:");
                    String wordToRemoveFrom = scanner.nextLine();
                    System.out.println("Enter a letter to remove:");
                    char letterToRemove = scanner.nextLine().charAt(0);
                    String wordAfterRemoval = StringUtils.removeLetter(wordToRemoveFrom, letterToRemove);
                    System.out.println("Word after removal: " + wordAfterRemoval);
                    break;
                case 5:
                    System.out.println("Enter a word:");
                    String wordToPrint = scanner.nextLine();
                    StringUtils.printLettersInNextLine(wordToPrint);
                    break;
                case 6:
                    System.out.println("Enter a word:");
                    String wordToCheck = scanner.nextLine();
                    StringUtils.findIfItsPair(wordToCheck);
                    boolean isPair = StringUtils.findIfItsPair(wordToCheck);
                    System.out.println("Is it Pair? " + isPair);
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }


    }



}