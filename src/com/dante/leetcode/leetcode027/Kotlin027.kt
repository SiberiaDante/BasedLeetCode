package com.dante.leetcode.leetcode027

/**
 * Created: SiberiaDante
 * Email: 2654828081@qq.com
 * GitHub: https://github.com/SiberiaDante
 * Blog: http://www.cnblogs.com/shen-hua/
 * CreateTime: 2018/4/14
 * UpDateTime:
 * Describe:27 移除元素
 * <p>描述：给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。不要使用额外的数组空间，
 * 你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。</p>
 */
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