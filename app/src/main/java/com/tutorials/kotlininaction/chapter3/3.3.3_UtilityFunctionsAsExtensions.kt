package com.tutorials.kotlininaction.chapter3

fun <T> Collection<T>.jointToString(separator : String = ", ", prefix: String = "", postfix : String = "") : String{
    val result = StringBuilder(prefix)

    for((index, element) in this.withIndex()){
        println("$index: $element")
        if(index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(separator: String = ", ", prefix: String = "", postfix: String = "") = joinToString(separator, prefix, postfix)


fun main(){
    val list = listOf(1,2,3)
    println(list.jointToString(separator = "; ", prefix = "(", postfix = ")"))

    val list2 = arrayListOf(1,2,3)
    println(list2.jointToString(" "))

    println(listOf("one", "two", "three").join(" "))

//    listOf(1,2,3).join()  -- type mismatch
    println(listOf("1","2","3").join())
}