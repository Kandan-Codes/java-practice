package com.mani.practice;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the value: ");
            int n = scanner.nextInt();

            int value = 1;
            boolean isFirstHalf = true;
            int total = 1;

            for (int outerIndex = 1; outerIndex <= n * 2 - 1; outerIndex++) {
                if (isFirstHalf) {
                    for (int space = 1; space <= n - outerIndex; space++) {
                       System.out.print("  ");
                    }

                    value = outerIndex;

                    for (int innerIndex = 1; innerIndex <= outerIndex; innerIndex++) {
                        //if it's a first and last number then print row number itself
                        if (innerIndex == 1 || innerIndex == outerIndex) {
                            System.out.print(outerIndex + " ");
                        } else {
                            System.out.print(value + " ");
                        }

                        //increment the value only if it's a middle values
                        if (innerIndex < outerIndex) {
                            value++;
                        }

                        //print '*' if it's not a last number
                        if (innerIndex < outerIndex) {
                            System.out.print("* ");
                        }
                    }

                    if (outerIndex == (n * 2 - 1) / 2 + 1 ) {
                        isFirstHalf = false;
                    }
                }
                else {
                    value = (n * 2 - 1) - outerIndex + 1;

                    for (int space = 1; space <= total; space++) {
                        System.out.print("  ");
                    }

                    for (int innerIndex = 1; innerIndex <= (n * 2 - 1) - outerIndex + 1; innerIndex++) {
                        if (innerIndex == 1 || innerIndex == (n * 2 - 1) - outerIndex + 1) {
                            System.out.print(((n * 2 - 1) - outerIndex + 1) + " ");
                        } else {
                            System.out.print(value + " ");
                        }

                        if (innerIndex < outerIndex) {
                            value++;
                        }

                        if (innerIndex < (n * 2 - 1) - outerIndex + 1) {
                            System.out.print("* ");
                        }
                    }

                    total++;
                }
                System.out.println();
            }
        }

    }
}
