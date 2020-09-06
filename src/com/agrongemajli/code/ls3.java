package com.agrongemajli.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class ls3 {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        String x = "abcabcbb";
        System.out.println(s3.lengthOfLongestSubstring(x));
    }

}
class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<String, Integer> hm = new HashMap<>();

        int l = 0;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            while(hm.containsKey(s.substring(i, i+1))){
                hm.remove(s.substring(l, l+1));
                l+=1;
            }
            hm.put(s.substring(i, i+1), 0);
            result = Math.max(result, i - l + 1);
        }
        return result;
    }
}