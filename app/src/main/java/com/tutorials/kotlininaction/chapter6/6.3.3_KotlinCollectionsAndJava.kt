package com.tutorials.kotlininaction.chapter6

/**
 *  Created by hannah on 2020-01-20
 *
 *  Collection type       Read-Only               Mutable
 *  List                   listOf           mutableListOf, arrayListOf
 *  Set                    setOf            mutableSetOf,  hashSetOf,  linkedSetOf,  sortedSetOf
 *  Map                    mapOf            mutableMapOf,  hashMapOf,  linkedMapOf,  sortedMapOf
 */

/*Java*/
//public class CollectionUtils{
//    public static List<String> uppercaseAll(List<String> items){
//        for(int i = 0; i< item.size(); i++){
//            items.set(i, item.get(i).toUpperCase())
//        }
//        return items;
//    }
//}

/*Kotlin*/
fun printInUppercase(list: List<String>){
    println(CollectionUtils.uppercaseAll(list))
    println(list.first())
}


fun main(){
    val list = listOf("a", "b","c")
    printInUppercase(list)
}
