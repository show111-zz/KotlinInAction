package com.tutorials.kotlininaction.chapter6

import java.lang.IllegalArgumentException

/**
 *  Created by hannah on 2020-01-20
 *  Description: Nothing-->This function never returns
 */

fun fail(message: String) : Nothing{
    throw IllegalArgumentException(message)
}

fun main(){
    fail("Error occurred")
}
