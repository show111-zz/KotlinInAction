package com.tutorials.kotlininaction.chapter7

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

/**
 *  Created by hannah on 2020-01-20
 */
@RequiresApi(Build.VERSION_CODES.O)
operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object : Iterator<LocalDate>{
        var current = start
        override fun hasNext() =
            current <= endInclusive

        override fun next() = current.apply {
            current = plusDays(1)
        }
    }

fun main(){
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        val newYear = LocalDate.ofYearDay(2020,1)
        val daysOff = newYear.minusDays(1)..newYear
        for (daysOff in daysOff){
            println(daysOff)
        }
    } else {
        println("VERSION.SDK_INT < O")
    }
}
