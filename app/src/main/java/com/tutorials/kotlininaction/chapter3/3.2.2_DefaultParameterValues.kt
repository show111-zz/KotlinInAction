@file:JvmName("StringFunctions")   // annotation to specify the class name & before the package statement

package com.tutorials.kotlininaction.chapter3

import java.lang.StringBuilder

val list3 = listOf(1, 2, 3)

fun <T> joinToString2(collection: Collection<T>, separator : String = "", prefix : String = "", postfix : String = "") : String{
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()){
        if(index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}


fun main(){
    println(joinToString2(list3, ", ", ", ", " "))

    println(joinToString2(list3))

    println(joinToString2(list3, "; ")) // overload

    println(joinToString2(list3, postfix = ";", prefix = "# ")) // in any order you want
}