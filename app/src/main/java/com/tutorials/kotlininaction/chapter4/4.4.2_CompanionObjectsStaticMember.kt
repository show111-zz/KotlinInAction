package com.tutorials.kotlininaction.chapter4

/**
 *  Created by hannah on 2020-01-13
 */
class A {
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}

class User1 {
    val nickname: String

    // secondary constructors
    constructor(email: String) {
        nickname = email.substringBefore('@')
    }

    constructor(facebookAccountId: Int) {
        nickname = getFacebookName(facebookAccountId)
    }

    private fun getFacebookName(facebookAccountId: Int): String {
        return "facebook name's account id is $facebookAccountId"
    }


}

class UserS private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) = User1(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) = User1(accountId)
    }
}


fun main() {
    A.bar()

    val subscribingUser = UserS.newSubscribingUser("bob@gmail.com")
    val facebookUser = UserS.newFacebookUser(4)

    println(subscribingUser.nickname)
}
