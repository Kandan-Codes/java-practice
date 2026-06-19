package com.mani.practice;

import sun.awt.X11.XSetWindowAttributes;

import java.util.Arrays;

public class PermutationTwo {
    public static void main(String[] args) {
        String str = "abc";
        printAllPermutations(0, str.toCharArray());
    }

    private static void printAllPermutations(int fixedIndex, char[] charArray) {
        //base condition: if fiexedIndex reached at end of the array then print that permuation
        if (fixedIndex == charArray.length - 1) {
            System.out.println(Arrays.toString(charArray));
            return;
        }

        for(int index = fixedIndex; index <= charArray.length - 1; index++) {
            swap(charArray, index, fixedIndex);
            printAllPermutations(fixedIndex + 1, charArray);
            swap(charArray, index, fixedIndex);
        }
    }

    private static void swap(char[] charArray, int firstPosition, int secondPosition) {
        char character = charArray[firstPosition];
        charArray[firstPosition] = charArray[secondPosition];
        charArray[secondPosition] = character;
    }
}
