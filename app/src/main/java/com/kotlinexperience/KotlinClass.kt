package com.kotlinexperience

import android.content.Context

//kotlin的class默认是final, 如果想要能被继承，那么需要使用open 修饰
//open 
class KotlinClass {
    var name = "Kotlin";
    var age = 19;
    fun GrowUp(){
        age = 23;
    }
    companion object {
        @JvmField //静态，不可修饰，相当java内的static final
        val VISIBLE: Int = 99
        @JvmField //被@JvmField修饰的属性不会自动生成setter/getter函数
        val INVISIBLE: Int = 66
        @JvmStatic//静态，相当java内的static
        fun inflate(context: Context, resource: Int) {}
    }

}