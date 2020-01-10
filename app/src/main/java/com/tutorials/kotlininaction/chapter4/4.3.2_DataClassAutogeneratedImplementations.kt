package com.tutorials.kotlininaction.chapter4

/**
 *  Created by hannah on 2020-01-10
 */
data class Client2(val name: String, val postCode: Int)


class Client3(val name: String, val postCode: Int) {
    fun copy(name: String = this.name, postCode: Int = this.postCode) = Client2(name, postCode)
}


fun main(){
    val bob = Client3("Bob", 123)
    println(bob.copy(postCode = 234))
}
