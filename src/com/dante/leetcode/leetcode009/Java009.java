package com.dante.leetcode.leetcode009;

/**
 * Created: SiberiaDante
 * Email: 2654828081@qq.com
 * GitHub: https://github.com/SiberiaDante
 * Blog: http://www.cnblogs.com/shen-hua/
 * CreateTime: 2018/4/8
 * UpDateTime:
 * Describe:9 判断一个整数是否是回文数。不能使用辅助空间
 */
public class Java009 {
    public static boolean isPalindrome(int x) {
        if (x < 0) {//负数不是回文数
            return false;
        } else if (x < 10) {
            return true;
        } else {
            int highLength = 1;
            //获取 x 的最高位数量级，如 x=123,highLength=100,x=23451,highLength=10000...
            while ((x / highLength) >= 10) {
                highLength = highLength * 10;
            }
            int lowLength = 10;
            //(x / highLength) % 10 取待比较数的最高位数
            //(x % lowLength) / (lowLength / 10) 取待比较数的最低位
            while ((x / highLength) % 10 == (x % lowLength) / (lowLength / 10)) {
                if (highLength < lowLength) {
                    return true;
                }
                //相等时，最高位左移，最低位右移
                lowLength = lowLength * 10;
                highLength = highLength / 10;
                if (highLength < lowLength) {
                    return true;
                }
            }
            return false;
        }
    }
}
