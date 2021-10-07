package com.tutorials.kotlininaction.chapter5

/**
 *  Created by hannah on 2020-01-14
 */
data class Person5(val name: String, val age: Int)


fun main(){
    val list = listOf(1,2,3,4)
    // only even numbers remain
    println(list.filter { it % 2 == 0 })

    val people = listOf(Person5("Alice", 29), Person5("Bob",32))
    // the filter function can remove unwanted elements from a collection, but it doesn't change the elements
    println(people.filter { it.age > 30 })

    val list2 = listOf(1,2,3,4)
    println(list2.map { it * it })

    // both have the same output, it can be nicely rewritten using member references
    println(people.map { it.name })
    println(people.map(Person5::name))

    // chain several calls
    println(people.filter { it.age > 30 }.map(Person5::name))

    // this code repeat the process of finding the maximum age. means 100 people performed 100 times!
    people.filter { it.age == people.maxByOrNull(Person5::age)?.age }
    // this code improved on that and calculates the maximum age only once!
    val maxAge = people.maxByOrNull(Person5::age)?.age
    people.filter { it.age == maxAge }

    // apply the filter and transformation functions to maps
    // filterKeys mapKeys filterValues mapValues
    val numbers = mapOf( 0 to "Zero", 1 to "One")
    println(numbers.mapValues { it.value.toUpperCase() })

}
