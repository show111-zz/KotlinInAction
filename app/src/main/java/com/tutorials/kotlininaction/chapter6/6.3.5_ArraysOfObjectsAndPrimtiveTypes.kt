package com.tutorials.kotlininaction.chapter6

/**
 *  Created by hannah on 2020-01-20
 *  Description:
 *              create an array:  arrayOf,  arrayOfNulls,  Array constructor
 */
// i means index of array
val letters = Array<String>(26) { i -> ('a' + i).toString() }

val strings = listOf("a", "b", "c")

// create an array of a primitive type
val fiveZeros = IntArray(5)
val fiveZerosToo = intArrayOf(0, 0, 0, 0, 0)


fun main(args: Array<String>) {
    for (i in args.indices) {
        println("Argument $i is： ${args[i]}")
    }
    args.forEachIndexed { index, element ->
        println("Argument $index is : $element")
    }

    println(letters.joinToString(""))

    // The spread operator(*) is used to pass an array when vararg parameters is expected
    println("%s/%s/%s".format(*strings.toTypedArray()))

    // user the constructor accepting a lambda
    val squares = IntArray(5) { i -> (i + 1) * (i + 1) }
    println(squares.joinToString())
}
