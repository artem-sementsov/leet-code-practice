package org.sementsov.leetcode.reverseinteger;

public class ReverseInteger {

    public static void main(String[] args) {

        System.out.println((int) 5/10);
        System.out.println(new Solution().reverse(321));
    }
}

class Solution {
    public int reverse(int x) {

        int result = 0;


        while (x != 0) {
            int mod = x % 10;
            int div = x / 10;

            result = result * 10 + mod;

            x = div;
        }
        return 0;
    }
}