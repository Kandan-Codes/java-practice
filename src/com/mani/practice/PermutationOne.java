package com.mani.practice;

public class PermutationOne {
    public static void main(String[] args) {
        String str = "abc";
        printAllPermutations("", str);
    }

    private static void printAllPermutations(String processing, String nonProcessing) {
        //base condition: if nonProcessing is emmty then print the processing
        if(nonProcessing.isEmpty()) {
            System.out.println(processing);
            return;
        }

        char character = nonProcessing.charAt(0);

        for(int index = 0; index < processing.length() + 1; index++) {
            String firstSubstring = processing.substring(0, index);
            String secondSubstring = processing.substring(index, processing.length());
            printAllPermutations(firstSubstring + character + secondSubstring, nonProcessing.substring(1));
        }
    }
}
