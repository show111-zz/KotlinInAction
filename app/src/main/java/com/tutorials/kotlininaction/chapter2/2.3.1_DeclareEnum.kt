package com.tutorials.kotlininaction.chapter2

enum class Color2 {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

enum class Color(
    val r: Int, val g: Int, val b: Int
) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 165, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 170),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun main(args : Array<String>){
    println(Color.BLUE.rgb())
}

