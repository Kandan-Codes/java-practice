package com.mani.practice;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class StackProblem {
    public static void main(String[] args) {
        int[] nums = {6, 8, 0, 1, 3};

        Deque<Integer> stack = new ArrayDeque<>();
        int[] answer = new int[nums.length];
        Arrays.fill(answer, -1);

        for (int index = 0; index < nums.length; index++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[index]) {
                answer[stack.pop()] = nums[index];
            }
            stack.push(index);
        }

        System.out.println(Arrays.toString(answer));
    }
}
