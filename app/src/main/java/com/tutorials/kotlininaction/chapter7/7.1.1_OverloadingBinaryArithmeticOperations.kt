package com.tutorials.kotlininaction.chapter7

/**
 *  Created by hannah on 2020-01-20
 *  operator keyword:
 *          a * b    times
 *          a / b    div
 *          a % b    mod
 *          a + b    plus
 *          a - b    minus
 */
data class Point(val x: Int, val y: Int) {
    // note the operator keyword
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

// this implementation is exactly the same as the above
operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

fun main() {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    // calls the "plus" function using the "+" sign
    println(p1 + p2)

    println(p1 * 1.5)

    println('a' * 3)
}
