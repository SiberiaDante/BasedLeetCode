package com.siberiadante.baseleetcode.leetcode002

import android.util.Log

/**
 * Created: SiberiaDante
 * Email: 2654828081@qq.com
 * GitHub: https://github.com/SiberiaDante
 * Blog: http://www.cnblogs.com/shen-hua/
 * CreateTime: 2018/4/8
 * UpDateTime:
 * Describe:给定一个范围为 32 位 int 的整数，将其颠倒。
 */
class Kotlin007 {
    fun reverse(x: Int): Int {
        var startLen = 0
        if (x < 0) {
            startLen = 1
        }
        var str: String = x.toString()
        if (str.length == 1) {
            return x
        }
        var lastLen = str.length - 1
        var readStr = ""
        while (lastLen >= startLen) {
            readStr += str[lastLen]
            lastLen--
        }
        return try {
            if (startLen == 0) {
                readStr.toInt()
            } else {
                readStr.toInt() * (-1)
            }
        } catch (e: NumberFormatException) {
            0
        }
    }
}