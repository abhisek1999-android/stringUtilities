/**
 * Created by ABHISEK SEAL on 2020-06-24.
 */

package com.iseal.stringutilities

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*


/** This function takes two string dates of any format and returns if the 2nd Date grater or equal to the first one */
@RequiresApi(Build.VERSION_CODES.O)
fun String.isDateGreaterThanOrEqual(other: String, pattern : String): Boolean {
        val formatter = DateTimeFormatter.ofPattern(pattern)
        val date1 = LocalDateTime.parse(this, formatter)
        val date2 = LocalDateTime.parse(other, formatter)
        return date2.isAfter(date1) || date2.isEqual(date1)
}


/** capitalize first letter of any string  */
fun String.capitalizeFirstLetter(): String = this.replaceFirstChar {
    if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
}

/** capitalize first letter of each word in a string */
fun String.capitalizeWords(): String = split(" ").joinToString(" ") { it ->
    it.replaceFirstChar {
        if (it.isLowerCase()) it.titlecase(
            Locale.ROOT
        ) else it.toString()
    }
}

/** remove duplicate characters from a string */
fun String.removeDuplicates(): String? {
    val result = java.lang.StringBuilder()
    for (element in this) {
        if (result.indexOf(element.toString()) == -1) {
            result.append(element)
        }
    }
    return result.toString()
}


/** count occurrences of a substring in a string */
fun String.countOccurrences(target: String): Int {
    var count = 0
    var index = 0
    while (this.indexOf(target, index).also { index = it } != -1) {
        count++
        index += target.length
    }
    return count
}

/** reverse a string */
fun String.reverse(): String? {
    val reversed = StringBuilder(this)
    return reversed.reverse().toString()
}


