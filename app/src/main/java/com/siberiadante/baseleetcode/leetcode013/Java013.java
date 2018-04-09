package com.siberiadante.baseleetcode.leetcode013;

/**
 * Created: SiberiaDante
 * Email: 2654828081@qq.com
 * GitHub: https://github.com/SiberiaDante
 * Blog: http://www.cnblogs.com/shen-hua/
 * CreateTime: 2018/4/9
 * UpDateTime:
 * Describe:
 * 1.对应转换关系：I(1)，V(5)，X(10)，L(50)，C(100)，D(500)，M(1000)
 * 2.规则：
 * 2.1：相同的数字连写， 所表示的数等于这些数字相加得到的数。如 XXX表示 30；
 * 2.2：小的数字在大的数字的右边， 所表示的数等于这些数字相加得到的数 如VIII 表示8；
 * 2.3：小的数字(限于I, X, C)在大的数字的左边， 所表示的数等于大数减去小的数： 如IV 表示4；
 * 2.4：在一个数的上面画一条横线， 表示这个数增值1000倍(由于题目只考虑4000以内的数，所以这条规则不用考虑)；
 * 3.组数规则：
 * 3.1：I, X, C： 最多只能连用3个， 如果放在大数的左边，只能用1个;
 * 3.2:V, L, D: 不能放在大数的左边，只能使用一个;
 * 3.3:I 只能用在V和X的左边。 IV表示4, IX表示9;
 * 3.4:X只能放在L,C左边。 XL 表示40, XC表示90;
 * 3.5:C只能用在D, M左边。 CD 表示400, CM表示900
 */
public class Java013 {
    /**
     * 给定一个罗马数字，将其转换成整数。
     */
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
}
