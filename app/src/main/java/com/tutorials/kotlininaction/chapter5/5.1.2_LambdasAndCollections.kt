package com.tutorials.kotlininaction.chapter5

/**
 *  Created by hannah on 2020-01-14
 */
data class Person(val name: String, val age: Int)

fun findTheOldest(people:List<Person>){
    var maxAge = 0
    var theOldest: Person? = null
    for(person in people){
        if(person.age>maxAge){
            maxAge = person.age
            theOldest=person
        }
    }
    println(theOldest)
}

fun main(){
    val people = listOf(Person("Alice", 20), Person("Bob", 22))
    findTheOldest(people)

    //using a lambda
    println(people.maxBy { it.age })

    people.maxBy { p:Person -> p.age }
}
