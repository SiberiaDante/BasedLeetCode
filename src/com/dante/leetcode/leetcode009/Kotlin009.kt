package com.dante.leetcode.leetcode009

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