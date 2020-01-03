package com.tutorials.kotlininaction.chapter3


//fun <T> List<T>.last() : T { /*return the last element*/ }
//fun Collection<Int>.max() : Int { /* finding a maximum in a collection */}


fun main() {

    val strings: List<String> = listOf("first", "second", "fourteenth")
    println(strings.last())

    val numbers : Collection<Int> = setOf(1, 14,2)
    println(numbers.max())

}