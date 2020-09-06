package com.agrongemajli.code;

public class ls1486 {
    public static void main(String[] args) {
        System.out.println(new Solution1486().xorOperation(10, 5));
    }
}

class Solution1486 {
    public int xorOperation(int n, int start) {
        int k = 0;
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = start + 2*i;
            k = k^nums[i];
        }
        return k;
    }
}