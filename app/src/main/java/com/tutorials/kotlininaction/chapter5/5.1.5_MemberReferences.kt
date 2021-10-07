package com.tutorials.kotlininaction.chapter5

/**
 *  Created by hannah on 2020-01-14
 */
// member reference
val getAge = Person::age

val getAge2 = {person: Person -> person.age}

// top-level function
fun salute() = println("salute!")

data class Person3(val name:String, val age: Int)

fun Person3.isAdult() = age >= 21


fun main(){
    run(::salute)

    val people = listOf(Person("alice",12),Person("bob",23))
    people.maxByOrNull(getAge)

//    val action = { person: Person, message: String ->
//        sendEmail(person, message)
//    }
//    val nextAction = ::sendEmail

    // An action of creating an instance of Peson is saved as a value
    val createPerson = ::Person3
    val p = createPerson("Alice", 29)
    println(p)

    val predicate = Person3::isAdult
    println(predicate)

    val p2 = Person3("Dmitry", 34)
    val personsAgeFunction = Person3::age
    println(personsAgeFunction(p2))

    val dmitrysAgeFunction = p2::age
    println(dmitrysAgeFunction())

}

