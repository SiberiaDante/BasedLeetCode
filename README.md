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
* Kotlin 语言实现
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
> * 1.对应罗马——整数的转换关系：I(1)，V(5)，X(10)，L(50)，C(100)，D(500)，M(1000)
> * 2.规则：
>   * 2.1：相同的数字连写， 所表示的数等于这些数字相加得到的数。如 XXX表示 30；
>   * 2.2：小的数字在大的数字的右边， 所表示的数等于这些数字相加得到的数 如VIII 表示8；
>   * 2.3：小的数字(限于I, X, C)在大的数字的左边， 所表示的数等于大数减去小的数： 如IV 表示4；
>   * 2.4：在一个数的上面画一条横线， 表示这个数增值1000倍(由于题目只考虑4000以内的数，所以这条规则不用考虑)；
> * 3.组数规则：
>   * 3.1：I, X, C： 最多只能连用3个， 如果放在大数的左边，只能用1个;
>   * 3.2:V, L, D: 不能放在大数的左边，只能使用一个;
>   * 3.3:I 只能用在V和X的左边。 IV表示4, IX表示9;
>   * 3.4:X只能放在L,C左边。 XL 表示40, XC表示90;
>   * 3.5:C只能用在D, M左边。 CD 表示400, CM表示900

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
    fun romanToInt(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }
        var sum = 0
        for (i in 0 until s.lastIndex) {
            if (singleRomanToInt(s[i]) >= singleRomanToInt(s[i + 1]))
                sum += singleRomanToInt(s[i])
            else
                sum -= singleRomanToInt(s[i])
        }
        sum += singleRomanToInt(s[s.lastIndex])
        return sum
    }

    private fun singleRomanToInt(char: Char): Int {
        if ('I' == char) return 1
        if ('V' == char) return 5
        if ('X' == char) return 10
        if ('L' == char) return 50
        if ('C' == char) return 100
        if ('D' == char) return 500
        if ('M' == char) return 1000
        return 0
    }
```

###  14 编写一个函数来查找字符串数组中最长的公共前缀字符串
* Java 语言实现
```
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0] == null ? "" : strs[0];
        }
        //找出数组中字符长度最短的字符串的长度（决定最多进行轮循比较的次数或者说是位数）
        int minLength = Integer.MAX_VALUE;
        for (String s : strs) {
            if (minLength > s.length()) {
                minLength = s.length();
            }
        }
        boolean isCharEquals = true;
        int i;//记录最后一位相等字符的位置
        for (i = 0; i < minLength; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    isCharEquals = false;
                    break;
                }
            }
            if (!isCharEquals) {
                break;
            }
        }
        return strs[0].substring(0, i);
    }
```
* Kotlin 语言实现
```
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        if (strs.size == 1) return strs[0]
        var minLength = Int.MAX_VALUE
        for (i in strs.indices) {
            if (minLength > strs[i].length) {
                minLength = strs[i].length
            }
        }
        var endIndex = 0
        for (i: Int in 0 until minLength) {
            endIndex = i
            var isEquals = true
            for (j in strs.indices) {
                if (strs[0][i] != strs[j][i]) {
                    isEquals = false
                    break
                }
            }
            if (!isEquals) break
        }
        return strs[0].substring(0, endIndex)
    }
```

### 
* Java 语言实现
```

```
* Kotlin 语言实现
```

```