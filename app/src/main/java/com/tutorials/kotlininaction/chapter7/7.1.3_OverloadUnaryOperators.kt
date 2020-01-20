package com.tutorials.kotlininaction.chapter7

import java.math.BigDecimal

/**
 *  Created by hannah on 2020-01-20
 *  Description:  a unary operator
 *    +a             unaryPlus
 *    -a             unaryMinus
 *    !a             not
 *    ++a, a++       inc
 *    --a, a--       dec
 */
/*defining a unary operator*/
operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE

fun main(){
    val p = Point(10, 20)
    println(-p)

    var bd = BigDecimal.ZERO
    println(bd++)
    println(++bd)
}
