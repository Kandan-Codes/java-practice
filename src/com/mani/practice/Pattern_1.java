package com.mani.practice;

public class Pattern_1 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n * 2 - 1; i++) {
            if (i <= n){
                for (int j = 1; j <= i ; j++) {
                    System.out.printf("%-5d" , j);
                }
            }
            else {
                for (int j = 0; j < i - n ; j++) {
                    System.out.print("     ");
                }

                for (int j = i - n + 1; j <= n ; j++) {
                    System.out.printf("%-5d" , j);
                }
            }
            System.out.println();
        }
    }
}
