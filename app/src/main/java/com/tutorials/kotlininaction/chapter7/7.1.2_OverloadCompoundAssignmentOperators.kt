package com.tutorials.kotlininaction.chapter7

/**
 *  Created by hannah on 2020-01-20
 *  Description:
 *          compound assignment operators:  += -=
 */


var point = Point(1,2)

val list = arrayListOf(1,2)

operator fun<T> MutableCollection<T>.plusAssign(element: T) {
    this.add(element)
}

fun main(){
    // this works only if the variable is mutable
    point += Point(3,4)
    println(point)

    val numbers = ArrayList<Int>()
    numbers += 42
    println(numbers[0])

    list += 3
    val newList = list + listOf(4,5)
    println(list)
    println(newList)

}
