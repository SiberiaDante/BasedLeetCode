package com.dante.leetcode.leetcode013

class Kotlin013 {
    /**
     * 给定一个罗马数字，将其转换成整数。
     */
    fun romanToInt(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }
        var sum = 0
        for (i in 0 until s.lastIndex) {
            if (singleRomanToInt(s[i]) >= singleRomanToInt(s[i + 1]))
                sum += singleRomanToInt(s[i])
            else
                sum -= singleRomanToInt(s[i])
        }
        sum += singleRomanToInt(s[s.lastIndex])
        return sum
    }

    private fun singleRomanToInt(char: Char): Int {
        if ('I' == char) return 1
        if ('V' == char) return 5
        if ('X' == char) return 10
        if ('L' == char) return 50
        if ('C' == char) return 100
        if ('D' == char) return 500
        if ('M' == char) return 1000
        return 0
    }
}