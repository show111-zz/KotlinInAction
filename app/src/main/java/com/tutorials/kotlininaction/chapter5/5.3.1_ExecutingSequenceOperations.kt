package com.tutorials.kotlininaction.chapter5

/**
 *  Created by hannah on 2020-01-16
 */

fun main() {

    // intermediate operation  &&  terminal operation
    listOf(1, 2, 3, 4).asSequence().map { print("map($it) "); it * it }
        .filter { print("filter($it) "); it % 2 == 0 }
        .toList()


    println(listOf(1,2,3,4).asSequence().map { it * it }.find { it > 3 }) //4

    /**
     *  map : goes first, each element is transformed
     *  filter: goes first, inappropriate elements are filtered out asap and aren't transformed
     */

}
