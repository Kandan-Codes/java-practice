package com.mani.practice;

public class Pattern {
    public static void main(String[] args) {

        int n = 4;

        boolean isFirstHalf = true;

        for (int i = 1; i <= (n * 2) - 1; i++) {
            if (isFirstHalf) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
                if(i == n) {
                    isFirstHalf = false;
                }
            } else {
                int space = (i - (n * 2 - 1) / 2) - 1;
                for (int k = 1; k <= space; k++) {
                    System.out.print("  ");
                }
                int value = (i - (n * 2 - 1) / 2);
                for (int l = value; l <= n; l++) {
                    System.out.print(l + " ");
                }
                System.out.println();

            }
        }

    }
}
