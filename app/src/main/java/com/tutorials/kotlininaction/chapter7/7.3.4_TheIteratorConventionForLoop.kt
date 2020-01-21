package com.tutorials.kotlininaction.chapter7

import java.time.LocalDate

/**
 *  Created by hannah on 2020-01-20
 */
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
    val newYear = LocalDate.ofYearDay(2020,1)
    val daysOff = newYear.minusDays(1)..newYear
    for (daysOff in daysOff){
        println(daysOff)
    }
}
