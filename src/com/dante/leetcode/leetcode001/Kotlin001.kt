package com.dante.leetcode.leetcode001

class Kotlin001 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var sum: Int
        for (i: Int in nums.indices) {
            for (j: Int in i+1 until nums.lastIndex+1) {
                sum = nums[i] + nums[j]
                if (target == sum) {
                    return intArrayOf(i,j)
                }
            }
        }
        return intArrayOf(-1,-1)
    }
}