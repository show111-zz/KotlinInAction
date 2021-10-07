package com.tutorials.kotlininaction.chapter1


data class Person(val name : String, val age : Int?= null)


fun main(args : Array<String>){

    val persons = listOf(Person("Alice"), Person("Bob", age = 29))

    // Elvis operator
    val oldest = persons.maxByOrNull { it.age ?: 0 }

    println("The oldest is : $oldest" )

}
/**
 * Functional Programming
 *      Benifits : 1. Conciseness 2. safe multithreading  3. easy testing
 *
 */
//fun findAlice() = findPerson { it.name == "Alice"}
//fun findBob() = findPerson { it.name == "Bob" }

