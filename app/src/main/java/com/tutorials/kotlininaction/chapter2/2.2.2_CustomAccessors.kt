package com.tutorials.kotlininaction.chapter2

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        // property getter declaration
        get() {
            return height == width
        }
}

class Rectangle1(val height: Int, val width: Int) {
    val isSquare: Boolean = height == width
}


fun main(args: Array<String>) {
    val rectangle = Rectangle(56, 61)
    println(rectangle.isSquare)

    val rectangle1 = Rectangle1(40, 40)
    println(rectangle1.isSquare)

}