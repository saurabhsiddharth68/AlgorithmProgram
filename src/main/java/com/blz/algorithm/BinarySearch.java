package com.blz.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch binaryObj = new BinarySearch();
        Scanner scanner = new Scanner(System.in);
        String[] wordList = {"hero", "bmw", "ducati", "tvs", "yamaha"};
        Arrays.sort(wordList);
        System.out.println("List of Words :");
        System.out.println(Arrays.toString(wordList));
        System.out.println("Enter the word you want to search");
        String searchName = scanner.nextLine();
        scanner.close();
        int result = binaryObj.binarySearch(wordList, searchName);

        if (result == -1)
            System.out.println("word is not present in the list");
        else
            System.out.println("word is found at "
                    + "index " + result);
    }

    public int binarySearch(String[] wordList, String searchName) {
        int start = 0, length = wordList.length - 1;
        while (start <= length) {
            int middle = start + (length - start) / 2;
            int result = searchName.compareTo(wordList[middle]);
            if (result == 0)
                return middle;
            if (result > 0)
                start = middle + 1;
            else
                length = middle - 1;
        }
        return -1;
    }
}
