package com.dante.leetcode.leetcode020


class Kotlin020 {
    fun isValid(s: String): Boolean {
        val charStack = ArrayList<Char>()
        for (i in s.indices) {
            if (s[i] == '(') {
                charStack.add('(')
            }
            if (s[i] == '[') {
                charStack.add('[')
            }
            if (s[i] == '{') {
                charStack.add('{')
            }
            if (s[i] == ')') {
                if (!charStack.isEmpty() && charStack[charStack.lastIndex] == '(') {
                    charStack.removeAt(charStack.lastIndex)
                    continue
                } else {
                    return false
                }
            }
            if (s[i] == ']') {
                if (!charStack.isEmpty() && charStack[charStack.lastIndex] == '[') {
                    charStack.removeAt(charStack.lastIndex)
                    continue
                } else {
                    return false
                }
            }
            if (s[i] == '}') {
                if (!charStack.isEmpty() && charStack[charStack.lastIndex] == '{') {
                    charStack.removeAt(charStack.lastIndex)
                    continue
                } else {
                    return false
                }
            }
        }
        return charStack.isEmpty()
    }
}