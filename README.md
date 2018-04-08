# BasedLeetCode
LeetCode learning records based on Java,Kotlin,Python...

> 对应LeetCode中题目序号
##### 1 两数之和
* Java语言实现
```
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
```

* Kotlin语言实现
```
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
```

