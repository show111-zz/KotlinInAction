package com.tutorials.kotlininaction.chapter6

/**
 *  Created by hannah on 2020-01-19
 *  lateinit
 */

class MyService{
    fun performAction(): String = "foo"
}

class MyTest{
    // a let-initialized property is always a var
    private lateinit var myService: MyService

    fun setUp(){
        myService = MyService()
    }

    fun testAction(){
//        Assert.assertEquals("foo", myService.performAction())
    }

}
