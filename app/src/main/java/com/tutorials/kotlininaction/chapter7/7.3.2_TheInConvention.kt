package com.tutorials.kotlininaction.chapter7

/**
 *  Created by hannah on 2020-01-20
 */
data class Rectangle(val upperLeft: Point2, val lowerRight: Point2)

operator fun Rectangle.contains(p: Point2): Boolean {
    return p.x in upperLeft.x until lowerRight.x && p.y in upperLeft.y until lowerRight.y
}

fun main(){
    val rect = Rectangle(Point2(10, 20), Point2(50,60))
    println(Point2(20,30) in rect)

    println(Point2(5,5) in rect)
}
