package com.dante.leetcode.leetcode027

class Kotlin027 {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        if (nums.isEmpty()) return 0
        var index = 0
        for (i in 0 until nums.size) {
            if (nums[i] != `val`) {
                nums[index++] = nums[i]
            }
        }
        return index
    }
}