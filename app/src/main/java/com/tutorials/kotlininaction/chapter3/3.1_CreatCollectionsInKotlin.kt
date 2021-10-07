package com.tutorials.kotlininaction.chapter3

import java.lang.StringBuilder


val set = hashSetOf(1, 7, 53)

val list = arrayListOf(1, 7, 53)

val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

val strings = listOf("first", "second","third")
val numbers = setOf(1, 14, 2)

fun <T> joinToString(collection: Collection<T>, separator : String, prefix : String, postfix : String) : String{
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()){
        if(index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}




fun main(){
    println(set.javaClass) // HashSet
    println(list.javaClass) // ArrayList
    println(map.javaClass) // HashMap

    println(strings.last())
    println(numbers.maxOrNull())

    println(strings) // invoke toString()

    val list2 = listOf(1,2,3)
    println(joinToString(list2, "; ","(",")"))

    // named arguments
    println(joinToString(list2, separator = " ", prefix = " ", postfix = "."))
}