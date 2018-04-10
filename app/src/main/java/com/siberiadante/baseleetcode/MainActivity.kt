package com.siberiadante.baseleetcode

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.siberiadante.baseleetcode.leetcode009.Kotlin009
import com.siberiadante.baseleetcode.leetcode013.Java013
import com.siberiadante.baseleetcode.leetcode013.Kotlin013
import com.siberiadante.baseleetcode.leetcode014.Java014
import com.siberiadante.baseleetcode.leetcode014.Kotlin014

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var reverse = Java007.reverse(1112)
//        var k = Kotlin007()
//        var reverse = k.reverse(1234567891)
//        var kotlin009 = Kotlin009()
//        var reverse = kotlin009.isPalindrome(1000030001)
//        var reverse=Java013.romanToInt("VI")
//        var kotlin013 = Kotlin013()
//        var reverse = Kotlin013().romanToInt("DCXXI")
        var reverse:String
        val str = arrayOf("abcfdsg", "abcrrr", "abcd", "abcde", "abcdef", "abcdefg")
//        val str= arrayOf("")
//        reverse=Java014.longestCommonPrefix(str)
        reverse= Kotlin014().longestCommonPrefix(str)
        Log.d("Main", "-------result-------" + reverse)
    }
}
