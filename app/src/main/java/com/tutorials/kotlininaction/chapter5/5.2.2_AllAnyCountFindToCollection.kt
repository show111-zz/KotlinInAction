package com.tutorials.kotlininaction.chapter5

/**
 *  Created by hannah on 2020-01-14
 */
val canBeInClub27 = { p: Person5 -> p.age <= 27 }

fun main() {
    /** all: checking whether all elements in a collection match a certain condition */
    val people = listOf(Person5("Alice", 27), Person5("Bob", 31))
    println(people.all(canBeInClub27))

    /** any: check whether there's at least one matching element */
    println(people.any(canBeInClub27))

    val list = listOf(1, 2, 3)
    println(!list.all { it == 3 }) // the negative ! isn't noticeable
    println(list.any { it != 3 }) // better way

    /** count: how many elements satisfy this predicate */
    println(people.count(canBeInClub27))
    println(people.filter(canBeInClub27).size)// less efficient

    /** find: to find an element that satisfy the predicate. return the first matching element if there are many or null if nothing satisfies the predicate */
    println(people.find(canBeInClub27))
    /** a synonym of find is firstOrNull, choose the one more clearly for you */
    println(people.firstOrNull(canBeInClub27))

}
