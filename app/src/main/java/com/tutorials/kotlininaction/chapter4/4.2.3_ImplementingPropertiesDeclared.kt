package com.tutorials.kotlininaction.chapter4

interface Users {
    // abstract property declaration
    val nickname: String
}

interface Users2 {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')
}

class PrivateUsers(override val nickname: String) : Users

class SubscribingUser(val email: String) : Users {
    override val nickname: String
        get() = email.substringBefore('@')
}

//class FacebookUser(val accountId: Int) : Users {
//    override val nickname: String = getFacebookName(accountId)
//}

fun main() {
    println(PrivateUsers("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)
}