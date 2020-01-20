package com.tutorials.kotlininaction.chapter6

import java.lang.IllegalArgumentException

/**
 *  Created by hannah on 2020-01-19
 */

fun foo(s: String?){
    // if s is null, the result is an empty string
    val t: String = s ?: ""
}

fun strLenSafe3(s: String?): Int = s?.length ?: 0

fun Person.countryName2()=company?.address?.country ?: "Unknown"

/**
 * using throw together with Elvis operator
 * */
fun printShippingLable(person: Person){
//    val address = person.company?.address?: throw IllegalArgumentException("No Address")
    val address = person.company?.address?: fail("No address")
    with(address){
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}

fun main(){
    println(strLenSafe3("abc"))
    println(strLenSafe3(null))

    val person = Person("Dmitry", null)
    println(person.countryName2())

    val address = Address("Elsestr. 47", 8794, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person2 = Person("Dmitry", jetbrains)
    printShippingLable(person2)

    printShippingLable(Person("Alexey", null))

}
