package com.siberiadante.baseleetcode.leetcode014;

import android.text.TextUtils;
import android.util.Log;

/**
 * Created: SiberiaDante
 * Email: 2654828081@qq.com
 * GitHub: https://github.com/SiberiaDante
 * Blog: http://www.cnblogs.com/shen-hua/
 * CreateTime: 2018/4/10
 * UpDateTime:
 * Describe: 14 编写一个函数来查找字符串数组中最长的公共前缀字符串
 */
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
}
