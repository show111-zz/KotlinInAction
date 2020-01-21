package com.tutorials.kotlininaction.chapter7

/**
 *  Created by hannah on 2020-01-20
 *  Description: get && set
 */
operator fun Point2.get(index: Int): Int{
    return when(index){
        0->x
        1->y
        else-> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.set(index: Int, value: Int){
    when(index){
        0->x = value
        1->y = value
        else-> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}


fun main(){
    val p = Point2(10,20)
    println(p[1])

    val p2 = MutablePoint(10,20)
    p2[1]= 42
    println(p2)
}
