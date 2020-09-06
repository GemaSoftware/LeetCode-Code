package com.agrongemajli.code;

import java.util.Arrays;
import java.util.Collections;

public class ls4 {
    public static void main(String[] args) {
        System.out.println(new Solution4().findMedianSortedArrays(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8}));
    }
}

class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length + nums2.length;
        int[] n = new int[l];
        //copies the arrays into a new array and sort them.
        System.arraycopy(nums1, 0, n, 0, nums1.length);
        System.arraycopy(nums2, 0, n, nums1.length, nums2.length);
        Arrays.sort(n);
        //if result array is even, grab left and right values from middle and divide by 2.
        if(n.length % 2 == 0){
            int left = n[(int) (Math.floor(n.length / 2) - 1)];
            int right = n[(int) (Math.floor(n.length / 2))];
            return (float) (left + right) / 2;
        } else {
            // if odd, just return value in the middle.
            return n[(int) (Math.floor(n.length / 2))];
        }
    }
}
