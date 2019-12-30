package com.tutorials.kotlininaction.chapter2

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun readNumber2(reader: BufferedReader){
    val number =  try {
        Integer.parseInt(reader.readLine())
    }catch (e : NumberFormatException){
//        return
        null
    }
    println(number)
}

fun main(){
    val reader = BufferedReader(StringReader("not a number"))
    readNumber2(reader)
}