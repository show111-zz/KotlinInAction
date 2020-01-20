package com.tutorials.kotlininaction.chapter6

/**
 *  Created by hannah on 2020-01-20
 */


val x = 1
val list = listOf(1L, 2L, 3L)
fun iteratorList(){
    for (x in list){
        println(x)
    }
}


fun main(){
//    println(x in list)
    println(x.toLong() in list)
}
