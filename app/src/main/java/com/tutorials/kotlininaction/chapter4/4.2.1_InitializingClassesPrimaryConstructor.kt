package com.tutorials.kotlininaction.chapter4

// Primary constructor with one parameter
class User constructor(_nickname: String) {
    val nickname: String
    // initializer block
    init {
        nickname = _nickname
    }
}

class User2(_nickname: String){
    val nickname = _nickname
}

// the most concise syntax
class User3(val nickname: String)

// provide a default value for the constructor parameter
class User4(val nickname: String, val isSubscribed: Boolean = true)


fun main(){
    val alice = User4("Alice")
    println(alice.isSubscribed)

    val bob = User4("Bob", false)
    println(bob.isSubscribed)

    val carol = User4("Carol", isSubscribed = false)
    println(carol.isSubscribed)
}

open class User5(val nickname: String){}

class TwitterUser5(nickname: String) : User5(nickname){}

// the default constructor without arguments is generated
open class Button2

class RadioButton: Button2()

// This class has a private constructor
class Secretive private constructor(){}