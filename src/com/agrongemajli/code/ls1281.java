package com.agrongemajli.code;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ls1281 {
    public static void main(String[] args) {
        System.out.println(new Solution1281().subtractProductAndSum(234));
    }
}

//pretty slow = 8ms faster than 5%
class Solution1281 {
    public int subtractProductAndSum(int test) {
        String[] digitsS = String.valueOf(test).split("");
        int[] digits = Arrays.stream(digitsS).mapToInt(Integer::parseInt).toArray();
        return IntStream.of(digits).reduce((x,y) -> x*y).orElse(0) - IntStream.of(digits).sum();
    }
}