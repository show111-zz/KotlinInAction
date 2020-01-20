package com.tutorials.kotlininaction.chapter6

/**
 *  Created by hannah on 2020-01-19
 */
fun verifyUserInput(input: String?){
    if(input.isNullOrBlank()){
        println("Please fill in the required fields")
    }
}

fun String?.isNullOrBlank(): Boolean = this== null || this.isBlank()

fun main(){
    verifyUserInput(" ")
    verifyUserInput(null)
}
