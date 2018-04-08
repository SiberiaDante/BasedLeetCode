# BasedLeetCode
LeetCode learning records based on Java,Kotlin,Python...[Github 地址](https://github.com/SiberiaDante/BasedLeetCode)

> 序号对应 LeetCode 中题目序号
### 1 两数之和
> 给定一个整数数列，找出其中和为特定值的那两个数,你可以假设每个输入都只会有一种答案，同样的元素不能被重用;
* Java 语言实现
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

* Kotlin 语言实现
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

### 7 给定一个范围为 32 位 int 的整数，将其颠倒
* Java 语言实现
```
    public static int reverse(int x) {
        int result;
        int startLen = 0;
        String str = String.valueOf(x);
        if (str.charAt(0) == '-') {
            startLen = 1;
        }
        if (str.length() == 1) {
            return x;
        }
        int lastLen = str.length() - 1;
        String readStr = "";
        while (lastLen >= startLen) {
            readStr = readStr + str.charAt(lastLen);
            lastLen--;
        }
        try {
            result = Integer.parseInt(readStr);
        }catch (NumberFormatException e){
            return 0;
        }
        return startLen == 0 ? result : result * (-1);
    }
```
*Kotlin 语言实现
```
    fun reverse(x: Int): Int {
        var startLen = 0
        if (x < 0) {
            startLen = 1
        }
        val str = x.toString()
        if (str.length == 1) {
            return x
        }
        var lastLen = str.length - 1
        var readStr = ""
        while (lastLen >= startLen) {
            readStr += str[lastLen]
            lastLen--
        }
        return try {
            if (startLen == 0) {
                readStr.toInt()
            } else {
                readStr.toInt() * (-1)
            }
        } catch (e: NumberFormatException) {
            0
        }
    }
```

### 
* Java 语言实现
```

```
* Kotlin 语言实现
```

```
