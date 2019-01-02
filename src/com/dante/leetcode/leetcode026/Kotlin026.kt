package com.siberiadante.baseleetcode.leetcode026

/**
 * Created: SiberiaDante
 * Email: 2654828081@qq.com
 * GitHub: https://github.com/SiberiaDante
 * Blog: http://www.cnblogs.com/shen-hua/
 * CreateTime: 2018/4/14
 * UpDateTime:
 * Describe:26. 删除排序数组中的重复项
 * <p>给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。</p>
 * <p>不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。</p>
 *
 */
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