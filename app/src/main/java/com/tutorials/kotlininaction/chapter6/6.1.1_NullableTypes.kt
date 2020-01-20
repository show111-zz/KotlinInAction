package com.tutorials.kotlininaction.chapter6

/**
 *  Created by hannah on 2020-01-19
 */
fun strLenSafe(s: String?): Int = if (s != null) s.length else 0

fun strLenSafe2(s: String?): Int? = s?.length


fun main(){
    val x: String?= null
    println(strLenSafe(x))

    println(strLenSafe("abc"))

    printAllCaps("cumbersome")
}
