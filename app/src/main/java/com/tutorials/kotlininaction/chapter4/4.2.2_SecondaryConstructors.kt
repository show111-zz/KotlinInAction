package com.tutorials.kotlininaction.chapter4

import android.content.Context
import android.util.AttributeSet

open class View3{
    // Secondary constructors
    constructor(ctx: Context){}
    constructor(ctx: Context, attr: AttributeSet){}
}

class MyButton : View3 {
    // calling superclass constructors
    constructor(ctx: Context) : super(ctx){}
    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr){}
}

class MyButton2 : View3 {
    // Delegates to another constructor of the class
//    constructor(ctx: Context) : this(ctx, "MY_STYLE"){}
    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr){}
}