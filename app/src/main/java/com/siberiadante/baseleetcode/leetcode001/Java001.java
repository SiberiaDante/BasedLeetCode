package com.siberiadante.baseleetcode.leetcode001;

/**
 * Created: SiberiaDante
 * Email: 2654828081@qq.com
 * GitHub: https://github.com/SiberiaDante
 * Blog: http://www.cnblogs.com/shen-hua/
 * CreateTime: 2018/4/8
 * UpDateTime:
 * Describe:
 */
public class Java001 {
    public int[] twoSum(int[] nums, int target) {
        int i, j;
        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                int sun = nums[i] + nums[j];
                if (target == sun) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
