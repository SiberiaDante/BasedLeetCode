package com.siberiadante.baseleetcode.leetcode009

/**
 * Created: SiberiaDante
 * Email: 2654828081@qq.com
 * GitHub: https://github.com/SiberiaDante
 * Blog: http://www.cnblogs.com/shen-hua/
 * CreateTime: 2018/4/9
 * UpDateTime:
 * Describe: 9 判断一个整数是否是回文数。不能使用辅助空间
 */
class Kotlin009 {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0)
            return false
        if (x < 10)
            return true
        var highLength = 1
        var lowLength = 10
        while (x / highLength >= 10) {
            highLength *= 10
        }

        while (x / highLength % 10 == x % lowLength / (lowLength / 10)) {
            if (highLength < lowLength) return true
            highLength /= 10
            lowLength *= 10
            if (highLength < lowLength) return true
        }
        return false
    }
}