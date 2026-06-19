package com.mani.practice;

public class Pattern_4 {
    public static void main(String[] args) {
        int n = 7;
        int left = n / 2;
        int right = left;
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (left == 0){
                    flag = false;
                }
                if (left == right){
                    System.out.print(left);
                }
                else {
                    if (j == left || j == right){
                        System.out.print(i == left ? left : right);
                    }
                }

                if (flag) {
                    left--;
                    right++;
                }
                else {
                    left++;
                    right--;
                }


                System.out.println();
            }
        }
    }
}
