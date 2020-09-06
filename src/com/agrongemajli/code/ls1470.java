package com.agrongemajli.code;

public class ls1470 {
    public static void main(String[] args) {
        int[] test = new int[]{1, 1, 2, 2};

        int[] x = new Solution1470().shuffle(test, 2);
        for (int y :
                x) {
            System.out.print(y + ", ");
        }
    }
}

class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        int half = nums.length / 2;
        int[] x = new int[half];
        int[] y = new int[half];
        int[] res = new int[nums.length];

        System.arraycopy(nums, 0, x, 0, half);
        System.arraycopy(nums,half,y,0,half);

        for (int i = 0; i < n; i++) {
            res[2 * i] = x[i];
            res[2*i + 1] = y[i];
        }
        return res;
    }
}