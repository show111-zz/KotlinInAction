package com.tutorials.kotlininaction.chapter6

/**
 *  Created by hannah on 2020-01-20
 */
fun <T> printHashCode(t: T){
    println(t?.hashCode())
}

fun <T: Any> printHashCode2(t: T){
    println(t.hashCode())
}

fun main(){
    printHashCode(null)
//    printHashCode2(null)
    printHashCode2(42)
}
