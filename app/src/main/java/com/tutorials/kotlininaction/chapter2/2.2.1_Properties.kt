package com.tutorials.kotlininaction.chapter2


class Person(val name : String, var isMarried : Boolean)



fun main(args: Array<String>){

    val person = Person("Bob", true)
    println(person.name)
    println(person.isMarried)

}
