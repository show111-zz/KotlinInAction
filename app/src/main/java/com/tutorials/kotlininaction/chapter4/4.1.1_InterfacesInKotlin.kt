package com.tutorials.kotlininaction.chapter4

interface Clickable{
    fun click()
    fun showOff() = println("I'm clickable! ")
}

interface Focusable{
    fun setFocusable(b : Boolean) = println("i ${if (b) "got" else "lost"} focus. ")
    fun showOff() = println("I'm focusable!")
}

class Button : Clickable, Focusable{
    override fun click() = println("I was clicked")
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
    // only one inherited implementation
    // override fun showOff() = super<Clickable>.showOff()
}

fun main(){
    val button = Button()
    button.showOff()
    button.setFocusable(true)
    button.click()
}