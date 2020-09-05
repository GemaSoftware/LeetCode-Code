package com.agrongemajli.code;

import java.util.Arrays;

public class lc1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(new Solution().twoSum(nums, target)));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++) {
                if( i == j ) continue;
                if( nums[i] + nums[j] == target ) return new int[]{i, j};
            }
        }
        return null;
    }
}
