package com.tutorials.kotlininaction.chapter4

// internal modifier visible in a module
internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}


// public member cannot access internal class, less-visible type
internal fun TalkativeButton.giveSpeech(){
//    yell()  // cannot access yell : it is private
//    whisper() // cannot access whisper : it is protected
}