package com.dante.leetcode.leetcode020;

import java.util.Stack;

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
