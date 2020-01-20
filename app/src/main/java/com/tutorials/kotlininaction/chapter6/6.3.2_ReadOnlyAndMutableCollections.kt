package com.tutorials.kotlininaction.chapter6

/**
 *  Created by hannah on 2020-01-20
 */
fun <T> copyElements(source: Collection<T>, target: MutableCollection<T>){
    for(item in source){
        target.add(item)
    }
}

fun main(){
    val source : Collection<Int> = arrayListOf(3,5,7)
    val target : MutableCollection<Int> = arrayListOf(1)
    copyElements(source, target)
    println(target)

    val target2 : Collection<Int> = arrayListOf(1)
//    copyElements(source, target2)  //  error
}
