package com.tutorials.kotlininaction.chapter7

/**
 *  Created by hannah on 2020-01-20
 *
 */
class Point2(val x: Int, val y: Int){
    override fun equals(other: Any?): Boolean {
        // identity equals operator(===) check whether the parameter to equals is the same object as the one on which equals is called.
        if(other === this) return true
        if(other !is Point2) return false
        return other.x==x && other.y == y
    }
}

fun main(){
    println(Point2(10, 20) == Point2(10,20))
    println(Point2(10, 20) != Point2(5,5))
    println(null == Point2(1,2))
}
