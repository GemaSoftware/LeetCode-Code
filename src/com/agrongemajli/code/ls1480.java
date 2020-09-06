package com.agrongemajli.code;

public class ls1480 {
    public static void main(String[] args) {
        int[] i = new int[]{1, 2, 3 , 4};
        System.out.println(new Solution1480().runningSum(i)[2]);
    }
}


class Solution1480 {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                res[i] = nums[i];
            } else {
                res[i] = nums[i] + res[i-1];
            }
        }
        return res;
    }
}