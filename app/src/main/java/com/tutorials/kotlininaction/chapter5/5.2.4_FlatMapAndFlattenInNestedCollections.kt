package com.tutorials.kotlininaction.chapter5

/**
 *  Created by hannah on 2020-01-14
 */
class Book(val title: String, val authors: List<String>)

fun main() {
    val books = setOf(
        Book("Thursday Next", listOf("Jasper Fforde")),
        Book("Mort", listOf("Terry Pratchett")),
        Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman"))
    )
    println(books.flatMap { it.authors }.toSet())


    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })

}
