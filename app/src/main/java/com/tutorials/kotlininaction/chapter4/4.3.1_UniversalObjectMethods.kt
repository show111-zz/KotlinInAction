package com.tutorials.kotlininaction.chapter4

/**
 *  Created by hannah on 2020-01-10
 */
class Client(val name: String, val postalCode: Int) {
    override fun toString(): String = "Client(name=$name, postalCode=$postalCode)"
    // Any? means "other" can be null
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client) return false
        return name == other.name && postalCode == other.postalCode
    }
    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
}

fun main() {

    // toString()
    val client1 = Client("Alice", 123)
    println(client1)

    /**
     *  In kotlin, == checks whether the objects are equals, not the references
     */
    // equals()
    val client2 = Client("Alice", 123)
    println(client1 == client2)

    // hashCode()
    val processed = hashSetOf(Client("Alice", 123))
    println(processed.contains(Client("Alice",123)))

}
