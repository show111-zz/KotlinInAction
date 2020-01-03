package com.tutorials.kotlininaction.chapter3

/**
 *
 */

// The word to in this line of code isn't a built-in construct, but rather a method invocation of s special kind, called an infix call.

val map2 = mapOf(1 to "One", 7 to "Seven", 53 to "Fifty-three")

infix fun Any.to(other : Any) = Pair(this, other)





fun main(){

    val (number, name) = 1 to "one"



}



