package com.mani.practice;

public class Pattern_3 {

    public static void main(String[] args) {
        int n = 6;
        int global = n;

        int top = (n * (n - 1) / 2) + 1;

        for (int i = 1 ; i <= n ; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("    ");
            }

            if (i == 1){
                System.out.printf("%-4d" , top);
            }
            else {
                int counter = global;
                System.out.printf("%-4d" , top);
                int temp = top + counter;
                for (int j = 1 ; j < i ; j++) {
                    System.out.printf("%-4d" , temp);
                    temp += ++counter;
                }
                global--;
            }

            top -= n - i;
            System.out.println();
        }
    }
}
