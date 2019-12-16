package com.tutorials.kotlininaction.chapter2

import java.lang.IllegalArgumentException

fun evalWithLoggin(e : Expr) : Int =
    when(e){
        is Num -> {
            println("num : ${e.value}")
            // this is the last expression in the block and is returned if e is of type Num
            e.value
        }
        is Sum -> {
            val left = evalWithLoggin(e.left)
            val right  = evalWithLoggin(e.right)
            println("sum : $left + $right")
            left + right
        }
        else -> throw IllegalArgumentException("Unknown expression")
    }



fun main(){
    println(evalWithLoggin(Sum(Sum(Num(1), Num(2)), Num(4))))
}