package com.tutorials.kotlininaction.chapter4

open class RichButton : Clickable{

    // this function is final: you can't override it in a subclass
    fun disable(){}

    // this function is open, you may override it in a subclass
    open fun animate(){}

    // this function is overrides and open function and is open as well
//    override fun click() {}

    final override fun click() = println("final isn't redundant here because override without final implies being open")

}


abstract class Animated{
    abstract fun animate()
    open fun stopAnimate(){}
    fun animateTwice(){}
}