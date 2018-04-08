package com.siberiadante.baseleetcode.leetcode007;

/**
 * Created: SiberiaDante
 * Email: 2654828081@qq.com
 * GitHub: https://github.com/SiberiaDante
 * Blog: http://www.cnblogs.com/shen-hua/
 * CreateTime: 2018/4/8
 * UpDateTime:
 * Describe:给定一个范围为 32 位 int 的整数，将其颠倒。
 */
public class Java007 {
    public static int reverse(int x) {
        int result;
        int startLen = 0;
        String str = String.valueOf(x);
        if (str.charAt(0) == '-') {
            startLen = 1;
        }
        if (str.length() == 1) {
            return x;
        }
        int lastLen = str.length() - 1;
        String readStr = "";
        while (lastLen >= startLen) {
            readStr = readStr + str.charAt(lastLen);
            lastLen--;
        }
        try {
            result = Integer.parseInt(readStr);
        }catch (NumberFormatException e){
            return 0;
        }
        return startLen == 0 ? result : result * (-1);
    }
}
