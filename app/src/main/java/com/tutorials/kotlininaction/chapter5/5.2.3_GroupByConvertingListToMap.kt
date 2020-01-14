package com.tutorials.kotlininaction.chapter5

/**
 *  Created by hannah on 2020-01-14
 */
val people = listOf(Person5("Alice", 31), Person5("Bob", 29), Person5("Carol", 31))

fun main(){
    // the result type is Map<Int, List<Person>>, do further modifications with this map using functions such as mapKeys and mapValues
    println(people.groupBy { it.age })

    val list = listOf("a","ab","b")
    println(list.groupBy(String::first))
}
