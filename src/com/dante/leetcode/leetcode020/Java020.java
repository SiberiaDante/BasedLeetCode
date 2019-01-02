package com.dante.leetcode.leetcode020;

import java.util.Stack;

/**
 * Created: SiberiaDante
 * Email: 2654828081@qq.com
 * GitHub: https://github.com/SiberiaDante
 * Blog: http://www.cnblogs.com/shen-hua/
 * CreateTime: 2018/4/11
 * UpDateTime:
 * Describe: 20 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效
 * 利用栈存放左括号，出现右括号时判断栈顶的左括号是否跟当前右括号相匹配，匹配则移除栈中元素；最后检测栈中元素是否全部被移除；
 */
public class Java020 {
    public boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                characterStack.push('(');
            }
            if (s.charAt(i) == '[') {
                characterStack.push('[');
            }
            if (s.charAt(i) == '{') {
                characterStack.push('{');
            }
            if (s.charAt(i) == ')') {
                if (!characterStack.isEmpty() && characterStack.pop() == '(') {
                    continue;
                } else {
                    return false;
                }
            }
            if (s.charAt(i) == ']') {
                if (!characterStack.isEmpty() && characterStack.pop() == '[') {
                    continue;
                } else {
                    return false;
                }
            }
            if (s.charAt(i) == '}') {
                if (!characterStack.isEmpty() && characterStack.pop() == '{') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return characterStack.isEmpty();
    }
}
