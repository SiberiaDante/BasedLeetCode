package com.siberiadante.baseleetcode

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.siberiadante.baseleetcode.leetcode007.Kotlin007

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var reverse = Java007.reverse(1112)
        var k = Kotlin007()
        var reverse = k.reverse(1234567891)
        Log.d("Main", "--------------" + reverse)
    }
}
