package com.tutorials.kotlininaction.chapter2

import java.util.*


class Rectangle2(val height: Int, val width: Int) {

    val isSquare: Boolean
        get() = height == width

}


fun createRandomRectangle(): Rectangle2 {

    val random = Random()

    return Rectangle2(random.nextInt(), random.nextInt())

}


fun main(args : Array<String>){

    println(createRandomRectangle().isSquare)

}