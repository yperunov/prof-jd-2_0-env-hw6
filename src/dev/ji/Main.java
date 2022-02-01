package dev.ji;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList(List.of("турка","кофе","солнце","утро","кофе"));

        printEvenNums(nums);
        printOddUniqueNumsAZSorted(nums);
        printWordsUniqueOnly(words);
        printDuplicatesWords(words);

    }

    private static void printDuplicatesWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println("Unique Words Number = " + (words.size()-uniqueWords.size()));
        System.out.println();
    }

    private static void printWordsUniqueOnly(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println("Unique Words = " + uniqueWords);
        System.out.println();
    }

    private static void printOddUniqueNumsAZSorted(List<Integer> nums) {
        Set<Integer> uniqueNumsAZSorted = new TreeSet<>(nums);
        System.out.print("Odd unique numbers AZ-sorted from this list = ");
        for (int num: uniqueNumsAZSorted) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println();
    }

    private static void printEvenNums(List<Integer> nums) {
        System.out.print("Even numbers from this list = ");
        for (int num: nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println();
    }
    
    
    
}
