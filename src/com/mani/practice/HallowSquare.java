package com.mani.practice;

import java.util.Scanner;

public class HallowSquare {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter the number: ");
            int n = scanner.nextInt();

            int totalSize = n * 2 - 1;

            for (int outerIndex = 0; outerIndex < totalSize; outerIndex++) {
                for (int innerIndex = 0; innerIndex < totalSize; innerIndex++) {

                    int top = outerIndex;
                    int left = innerIndex;
                    int bottom = (2 * n - 2) - outerIndex;
                    int right = (2 * n - 2) - innerIndex;

                    System.out.print(n - Math.min(right, Math.min(bottom, Math.min(top, left))) + " ");

                }

                System.out.println();
            }

        }

    }
}
