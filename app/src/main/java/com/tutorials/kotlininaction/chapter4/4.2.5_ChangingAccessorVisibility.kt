package com.tutorials.kotlininaction.chapter4

class LengthCounter{
    var counter: Int = 0
    private set  // can't change this property outside of the class

    fun addWord(word: String){
        counter += word.length
    }
}

fun main(){
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
}
