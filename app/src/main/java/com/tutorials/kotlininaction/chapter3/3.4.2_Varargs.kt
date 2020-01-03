package com.tutorials.kotlininaction.chapter3

/**
 * 可变参数: vararg
 */
val list2 = listOf(2,3,4,5,7,11)

fun main(args : Array<String>){
    val list = listOf("args: ", *args)
    println(list)
}