package com.siberiadante.baseleetcode

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.siberiadante.baseleetcode.leetcode009.Kotlin009

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var reverse = Java007.reverse(1112)
//        var k = Kotlin007()
//        var reverse = k.reverse(1234567891)
        var kotlin009 = Kotlin009()
        var reverse = kotlin009.isPalindrome(1234124321)
        Log.d("Main", "-------result-------" + reverse)
    }
}
