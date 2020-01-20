package com.tutorials.kotlininaction.chapter6

/**
 *  Created by hannah on 2020-01-20
 *  description:
 *          Integer types -- Byte, Short, Int, Long
 *          Floating-point number types -- Float, Double
 *          Character type -- Char
 *          Boolean type -- Boolean
 */
fun showProgress(progress: Int){
    val percent = progress.coerceIn(1, 100)
    println("we're ${percent}% done!")
}

fun main(){
    showProgress(146)
}
