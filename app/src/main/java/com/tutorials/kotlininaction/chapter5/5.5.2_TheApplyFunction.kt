package com.tutorials.kotlininaction.chapter5

import android.content.Context
import android.widget.TextView

/**
 *  Created by hannah on 2020-01-16
 */
fun alphabet4() = StringBuilder().apply {
    for (letter in 'A'..'Z'){
        append(letter)
    }
    append("\n Now I know the alphabet!")
}.toString()

fun main(){
//    println(alphabet4())
    println(alphabet5())
}

fun createViewWithCustomAttributes(context: Context) =
    TextView(context).apply {
        text = "Sample Text"
        textSize = 20.00F
        setPadding(10, 0,0,0)

    }


fun alphabet5() = buildString{
    for(letter in 'A'..'Z'){
        append(letter)
    }
    append(" \n Now I know the alphabet!")
}
