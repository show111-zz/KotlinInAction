package com.tutorials.kotlininaction.chapter5

import kotlin.text.StringBuilder

/**
 *  Created by hannah on 2020-01-16
 */
fun alphabet(): String{
    val result = StringBuilder()
    for (letter in 'A'..'Z'){
        result.append(letter)
    }
    result.append(" \n Now I know the alphabet!")
    return result.toString()
}

// WITH
fun alphabet2(): String{
    val stringBuilder = StringBuilder()
    return with(stringBuilder){
        for (letter in 'A'..'Z'){
            this.append(letter)
        }
        append(" \n Now I know the alphabet!")
        this.toString()
    }
}

fun alphabet3() = with(StringBuilder()){
    for(letter in 'A'..'Z'){
        append(letter)
    }
    append(" \n Now I know the alphabet!")
    toString()
}


fun main(){
//    println(alphabet())
//    println(alphabet2())
    println(alphabet3())
}
