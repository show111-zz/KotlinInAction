package com.tutorials.kotlininaction.chapter4

/**
 *  Created by hannah on 2020-01-13
 */
class Person6(val name: String) {
    companion object Loader{
        fun fromJSON(jsonText: String): Person6 = Person6(jsonText)
    }
}

interface JSONFactory<T>{
    fun fromJSON(jsonText: String) : T
}

class Person(val name: String){
    companion object : JSONFactory<Person6>{
        override fun fromJSON(jsonText: String): Person6 = Person6(name = "Hannah")
    }
//    fun <T> loadFromJSON(factory: JSONFactory<T>) : T{
//        return Person("ab")
//    }
}

fun main(){
    // you can use both ways to call fromJSON
    val person = Person6.Loader.fromJSON("{name: 'Dmitry'}")
    println(person.name)
    val person2 = Person6.fromJSON("{name: 'Dmitry'}")
    println(person2.name)
}
