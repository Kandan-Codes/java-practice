package com.mani.practice;

public class Pattern_2 {

    public static void main(String[] args) {
        int n = 5;
        int temp = 1;

        for (int i = 0 ; i < n ; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%-5d" , temp++);
                }
                temp = temp + n - 1;
            }
            else {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%-5d" , temp--);
                }
                temp = temp + n + 1;
            }

            System.out.println();
        }
    }
}
