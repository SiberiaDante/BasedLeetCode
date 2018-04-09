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

### 9 判断一个整数是否是回文数。不能使用辅助空间
> 什么是回文数：“回文”是指正读反读都能读通的句子；如："123321","我为人人，人人为我"等
* Java 语言实现
```
    public static boolean isPalindrome(int x) {
        if (x < 0) {//负数不是回文数
            return false;
        } else if (x < 10) {
            return true;
        } else {
            int highLength = 1;
            //获取 x 的最高位数量级，如 x=123,highLength=100,x=23451,highLength=10000...
            while ((x / highLength) >= 10) {
                highLength = highLength * 10;
            }
            int lowLength = 10;
            //(x / highLength) % 10 取待比较数的最高位数
            //(x % lowLength) / (lowLength / 10) 取待比较数的最低位
            while ((x / highLength) % 10 == (x % lowLength) / (lowLength / 10)) {
                if (highLength < lowLength) {
                    return true;
                }
                //相等时，最高位左移，最低位右移
                lowLength = lowLength * 10;
                highLength = highLength / 10;
                if (highLength < lowLength) {
                    return true;
                }
            }
            return false;
        }
    }
```
* Kotlin 语言实现
```
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
```

### 13 给定一个罗马数字，将其转换成整数
* Java 语言实现
```
    public int romanToInt(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (singleRomanToInt(s.charAt(i)) >= singleRomanToInt(s.charAt(i + 1))) {
                sum += singleRomanToInt(s.charAt(i));
            } else {
                sum -= singleRomanToInt(s.charAt(i));
            }
        }
        sum += singleRomanToInt(s.charAt(s.length() - 1));
        return sum;
    }

    private int singleRomanToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
```
* Kotlin 语言实现
```

```

### 
* Java 语言实现
```

```
* Kotlin 语言实现
```

```