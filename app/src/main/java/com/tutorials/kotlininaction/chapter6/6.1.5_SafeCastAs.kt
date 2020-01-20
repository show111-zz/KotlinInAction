package com.tutorials.kotlininaction.chapter6

/**
 *  Created by hannah on 2020-01-19
 */


/**
 * using a safe cast to implement equals
 */
class Person3(val firstName: String, val lastName: String){
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? Person3 ?: return false
        return other.firstName == firstName && otherPerson.lastName == lastName
    }

    override fun hashCode(): Int = firstName.hashCode() * 37 + lastName.hashCode()
}

fun main(){
    val p1 = Person3("Dmitry", " Jemerov")
    val p2 = Person3("Dmitry", " Jemerov")
    // the == operator calls the equal method
    println(p1 == p2)

    println(p1.equals(42))
}
