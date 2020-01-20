package com.tutorials.kotlininaction.chapter6

/**
 *  Created by hannah on 2020-01-20
 *  description: Int?, Boolean? and more
 */
data class Person4(val name: String, val age: Int? = null){
    fun isOlderThan(other: Person4) : Boolean? {
        if(age == null || other.age == null) return null
        return age > other.age
    }
}

fun main(){
    println(Person4("Sam", 35).isOlderThan(Person4("Amy", 42)))

    println(Person4("Sam", 35).isOlderThan(Person4("Amy")))
}

