package com.tutorials.kotlininaction.chapter5

/**
 *  Created by hannah on 2020-01-14
 */
val sum = { x: Int, y: Int -> x + y }

val sum2 = {x: Int, y: Int ->
    println("computing the sum of $x and $y")
    x + y
}


fun main(){
    println(sum(1,2))

    run { println(42) }

    val people = listOf(Person("alice",12),Person("bob",23))
    val names = people.joinToString(separator = " ", transform = {p:Person -> p.name})
    println(names)

    people.joinToString(" ") { p: Person -> p.name }

    val getAge ={p: Person -> p.age}
    people.maxBy(getAge)

    // member reference
    people.maxBy(Person::age)

    println(sum2(1,2))
}
