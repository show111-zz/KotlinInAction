package com.tutorials.kotlininaction.chapter5

import java.io.File

/**
 *  Created by hannah on 2020-01-16
 */
val naturalNumbers = generateSequence(0) { it + 1 }

val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }

fun File.isInsideHiddenDirectory() = generateSequence(this) { it.parentFile }.any { it.isHidden }

fun main(){
    println(numbersTo100.sum())

    val file = File("/Users/hannah/Downloads/a.txt")
    println(file.isInsideHiddenDirectory())

}
