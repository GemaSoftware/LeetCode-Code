package com.agrongemajli.code;

public class ls1365 {
    public static void main(String[] args) {
        int[] test = new int[]{4, 1, 2, 2, 8};
        int[] res = new Solution1365().smallerNumbersThanCurrent(test);
        for (int x :
                res) {
            System.out.print(x + ", ");
        }
    }
}

//slow - faster than 9% = 21ms eh O=n^2
class Solution1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int c = 0;
            for (int j = 0; j < nums.length; j++) {
                if(i == j) continue;
                if (nums[j] < nums[i]) {
                    c++;
                }
            }
            res[i] = c;
        }
        return res;
    }
}