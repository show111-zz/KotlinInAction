package com.tutorials.kotlininaction.chapter5

import android.view.View

/**
 *  Created by hannah on 2020-01-16
 */
fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All Done!") }
}

val listener = View.OnClickListener { view ->
    val text = when (view.id) {
//        R.id.botton1 ->"first button"
//        R.id.botton2 ->"second button"
        else ->"Unknown Button"
    }
}


fun main() {
    createAllDoneRunnable().run()
}
