package com.dante.leetcode.leetcode026

class Kotlin026 {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return 1
        var index = 1
        for (i in 1 until nums.size) {
            if (nums[i] != nums[i - 1]) {
                nums[index++] = nums[i]
            }
        }
        return index
    }
}