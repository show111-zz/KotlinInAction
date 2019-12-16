package com.tutorials.kotlininaction.chapter2

import java.lang.Exception

fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1== Color.RED && c2 == Color.YELLOW)|| (c1 == Color.YELLOW && c2 == Color.RED) -> Color.ORANGE

        (c1== Color.BLUE && c2 == Color.YELLOW)|| (c1 == Color.YELLOW && c2 == Color.BLUE) -> Color.GREEN

        (c1== Color.BLUE && c2 == Color.VIOLET)|| (c1 == Color.VIOLET && c2 == Color.BLUE) -> Color.INDIGO

        else -> throw Exception("Dirty Color")
    }


fun main(){
    println(mixOptimized(Color.BLUE, Color.YELLOW))
}