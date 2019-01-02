package com.siberiadante.baseleetcode.leetcode014

import android.util.Log

/**
 * Created: SiberiaDante
 * Email: 2654828081@qq.com
 * GitHub: https://github.com/SiberiaDante
 * Blog: http://www.cnblogs.com/shen-hua/
 * CreateTime: 2018/4/10
 * UpDateTime:
 * Describe:14 编写一个函数来查找字符串数组中最长的公共前缀字符串
 */
class Kotlin014 {
    //have bug
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        if (strs.size == 1) return strs[0]
        var minLength = Int.MAX_VALUE
        for (i in strs.indices) {
            if (minLength > strs[i].length)
                minLength = strs[i].length
        }
        var endIndex = 0
        for (i: Int in 0 until minLength) {
            endIndex = i + 1
            var isEquals = true
            for (j in strs.indices) {
                if (strs[0][i] != strs[j][i]) {
                    isEquals = false
                    break
                }
            }
            if (!isEquals) break
        }
        return strs[0].substring(0, endIndex)
    }
}