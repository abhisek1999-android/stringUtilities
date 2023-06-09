package com.iseal.stringutils

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import com.iseal.stringutilities.capitalizeFirstLetter
import com.iseal.stringutilities.isDateGreaterThanOrEqual


class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var str="lkjhasd"
        var str2="lkjhasd"
         val result = str.isDateGreaterThanOrEqual(str2, "yyyy-MM-dd HH:mm:ss")
        Log.d(TAG, "onCreate: $result")
        

    }
}