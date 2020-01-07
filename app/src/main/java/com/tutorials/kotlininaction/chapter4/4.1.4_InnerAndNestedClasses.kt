package com.tutorials.kotlininaction.chapter4

import java.io.Serializable

interface State : Serializable

interface View{
    fun getCurrentState(): State
    fun restoreState(state: State){}
}


class ButtonInner : View{
    override fun getCurrentState(): State = ButtonState()
    override fun restoreState(state: State) {}
    class ButtonState : State{}  // this class is an analogue of a static nested class in java
}

class Outer{
    inner class Inner{
        fun getOuterReference(): Outer = this@Outer
    }
}