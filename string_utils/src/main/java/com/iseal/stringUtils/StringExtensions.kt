package com.iseal.stringUtils

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
fun String.isDateGreaterThanOrEqual(other: String): Boolean {
    try {
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        val date1 = LocalDateTime.parse(this, formatter)
        val date2 = LocalDateTime.parse(other, formatter)
        return date2.isAfter(date1) || date2.isEqual(date1)
    }catch (e: Exception) {
        return false
        e.printStackTrace()
    }
}