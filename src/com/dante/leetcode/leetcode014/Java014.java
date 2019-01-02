package com.dante.leetcode.leetcode014;

public class Java014 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0] == null ? "" : strs[0];
        }
        //找出数组中字符长度最短的字符串的长度（决定最多进行轮循比较的次数或者说是位数）
        int minLength = Integer.MAX_VALUE;
        for (String s : strs) {
            if (minLength > s.length()) {
                minLength = s.length();
            }
        }
        boolean isCharEquals = true;
        int i;//记录最后一位相等字符的位置
        for (i = 0; i < minLength; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    isCharEquals = false;
                    break;
                }
            }
            if (!isCharEquals) {
                break;
            }
        }
        return strs[0].substring(0, i);
    }

    public static void main(String[] args) {
        String[] str=new String[]{"flower","flow","flight" };
        System.out.println(longestCommonPrefix(str));
    }
}
