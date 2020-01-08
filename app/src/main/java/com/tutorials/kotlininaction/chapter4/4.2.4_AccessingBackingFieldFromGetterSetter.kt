package com.tutorials.kotlininaction.chapter4

class User415(val name: String){
    var address: String = "unspecified"
    set(value: String) {
        println(""" Address was changed for $name: "$field" -> "$value".""".trimIndent())
        field = value
    }
}

fun main(){
    val user = User415("Alice")
    user.address = "340 Terry fox"
}
