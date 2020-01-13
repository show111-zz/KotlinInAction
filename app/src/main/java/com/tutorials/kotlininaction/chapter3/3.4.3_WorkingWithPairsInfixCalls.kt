package com.tutorials.kotlininaction.chapter3

/**
 * 中缀函数infix
 */

// The word to in this line of code isn't a built-in construct, but rather a method invocation of s special kind, called an infix call.

val map2 = mapOf(1 to "One", 7 to "Seven", 53 to "Fifty-three")

infix fun Any.to(other: Any) = Pair(this, other)

infix fun Double.interestBy(interestRate: Double): Double {
    return this * interestRate
}

class Department {
    var no: Int = 10
    infix fun rp(times: Int) {
        repeat(times) {
            println(no)
        }
    }
}


fun main() {

    val (number, name) = 1 to "one"

    val interest1 = 1000.00.interestBy(0.098)
    println("利息1: $interest1")

    val interest2 = 1000.00 interestBy 0.098
    println("利息2: $interest2")

    val dept = Department()
    dept rp 4


}



