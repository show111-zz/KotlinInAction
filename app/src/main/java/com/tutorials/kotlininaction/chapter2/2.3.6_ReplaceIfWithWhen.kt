package com.tutorials.kotlininaction.chapter2

import java.lang.IllegalArgumentException

fun eval2(e: Expr): Int =
    if (e is Num) {
        e.value
    } else if (e is Sum) {
        eval(e.right) + eval(e.left)
    } else {
        throw IllegalArgumentException("Unknown exception")
    }


fun eval3(e : Expr) : Int =
    when(e){
        is Num -> e.value
        is Sum -> eval3(e.right) + eval3(e.left)
        else -> throw IllegalArgumentException("Unknown expression")
    }



fun main(){
    println(eval2(Sum(Num(1), Num(2))))
    println(eval3(Sum(Num(4), Num(3))))
}