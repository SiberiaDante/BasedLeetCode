package com.dante.leetcode.leetcode013;

public class Java013 {
    /**
     * 给定一个罗马数字，将其转换成整数。
     */
    public int romanToInt(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (singleRomanToInt(s.charAt(i)) >= singleRomanToInt(s.charAt(i + 1))) {
                sum += singleRomanToInt(s.charAt(i));
            } else {
                sum -= singleRomanToInt(s.charAt(i));
            }
        }
        sum += singleRomanToInt(s.charAt(s.length() - 1));
        return sum;
    }

    private int singleRomanToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
