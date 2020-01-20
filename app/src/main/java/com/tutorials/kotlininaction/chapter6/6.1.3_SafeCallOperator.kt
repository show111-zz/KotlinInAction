package com.tutorials.kotlininaction.chapter6

/**
 *  Created by hannah on 2020-01-19
 */
fun printAllCaps(s: String?){
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)
}

class Employee(val name: String, val manager: Employee?)

class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun managerName(employee: Employee): String? = employee.manager?.name

fun Person.countryName(): String{
    val country = this.company?.address?.country
    return if (country != null) country else "Unknown"
}

fun main(){
    printAllCaps("cumbersome")

    val ceo = Employee("Da Boss", null)
    val developer = Employee("Bob Smith", ceo)
    println(managerName(developer))
    println(managerName(ceo))

    val person = Person("Dmitry", null)
    println(person.countryName())
}
