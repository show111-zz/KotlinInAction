package com.tutorials.kotlininaction.chapter6

/**
 *  Created by hannah on 2020-01-19
 *  description: !!
 */

/**
 *          ----foo != null -> foo
 * foo!! ---
 *          ----foo == null --> NullPointerException
 */

fun ignoreNulls(s: String?){
    val sNotNull: String = s!!
    println(sNotNull.length)
}

//class CopyRowAction(val listL: List<String>) : AbstractAction(){ }

fun main(){
    ignoreNulls(null)
}

