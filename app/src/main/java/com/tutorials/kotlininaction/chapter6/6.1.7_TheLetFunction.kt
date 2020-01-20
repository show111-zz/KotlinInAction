package com.tutorials.kotlininaction.chapter6

/**
 *  Created by hannah on 2020-01-19
 */

/**
 *
 * foo?.let{        ------ foo != null  it is non-null inside lambda
 *  ...it...   ----
 * }                ------ foo == null  nothing happens
 *
 */
fun sendEmailTo(email: String){
    println("Sending email to $email")
}


fun main(){
    var email: String?= "yole@example.com"
    email?.let { sendEmailTo(it) }

    email = null
    email?.let { sendEmailTo(it) }
}

