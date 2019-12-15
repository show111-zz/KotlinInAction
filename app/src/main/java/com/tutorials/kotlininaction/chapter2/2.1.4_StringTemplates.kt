package com.tutorials.kotlininaction.chapter2


fun main2(args: Array<String>) {

    val name = if (args.size > 0) args[0] else "Kotlin"
    // or
    val name1 = if (args.isNotEmpty()) args[0] else "Kotlin"

    println("Hello, $name")
    println("Hello, \$name")

}


fun main1(args: Array<String>){
    if(args.size > 0){
        println("Hello, ${args[0]}!")
    }
}

fun main(args: Array<String>){
    println("Hello, ${ if (args.size > 0) args[0] else "someone" } !")
}