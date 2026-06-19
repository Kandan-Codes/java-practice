package com.mani.practice;

import java.util.Scanner;

public class HallowSquare {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter the number: ");
            int n = scanner.nextInt();

            int totalSize = n * 2 - 1;

            for (int outer = 0; outer < totalSize; outer++) {
                for (int innerIndex = 0; innerIndex < totalSize; innerIndex++) {

                    int top = outer;
                    int left = innerIndex;
                    int bottom = (2 * n - 2) - outer;
                    int right = (2 * n - 2) - innerIndex;

                    System.out.print(n - Math.min(right, Math.min(bottom, Math.min(top, left))) + " ");

                }

                System.out.println();
            }

        }

    }
}
