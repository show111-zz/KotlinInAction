package com.tutorials.kotlininaction.chapter2


fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }


fun getWarmth(color: Color) = when(color){
    Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
    Color.GREEN -> "neutral"
    Color.BLUE, Color.VIOLET, Color.INDIGO -> "cold"
}


fun main(args: Array<String>) {
    println(getMnemonic(Color.BLUE))
    println(getWarmth(Color.ORANGE))
}