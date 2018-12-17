package com.kotlinexperience

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.util.Log
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*

//: 分号代表继承extends ，逗号代表实现implements
class MainActivity : AppCompatActivity(), View.OnClickListener, MyKotlinInterface {

    var a: Int = 1  // 立即赋值为Int类型的a
    val b = 2   // 自动推断出 `Int` 类型
    val TAG = "MainActivity";
    //空数组
    var mEmptyArray = emptyArray<Int>()

    //当某个变量的值可以为 null 的时候，必须在声明处的类型后添加 ? 来标识该引用可为空。
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //import kotlinx.android.synthetic.main.activity_main.*  导包
        //这个使用的是Kotlin的一个叫做Getter Setter技术
        HelloTextView.text = "剔除了findViewById()方法的调用";

        a = 3     //var，变量
        // b = 4  val不可变量

        //kotlin可以直接调用接口内的成员变量
        if (isOk) {
            Log.d("是否进入判断体 = " + isOk, "接口内的数字是 = " + Number)
        }

        val c: Int  // 如果没有初始值类型不能省略
        c = 3       // 明确赋值

//-------------------------------------------------------------------------------------------
        //if判断语体
        if (a > b) {
            Log.d(TAG, "a > b");
        } else {
            Log.d(TAG, "a < b");
        }
        //类型判断,强大的switch
        /**
         * when(条件){
         * 条件值1 -> 执行语句1
         * 条件值2 -> 执行语句2
         * 条件值3 -> 执行语句3
         * else -> 执行语句4}
         */
        when (a) {
            is Int -> println("a是Int类型")
            0 -> println("不喜欢")
            1 -> println("喜欢")
            2, 3, 4 -> println("别乱来")//并列条件
            in 4..6 -> println("再乱来我要叫咯")//区间
            else -> println("有一种爱叫做放手")
        }
//-------------------------------------------------------------------------------------------
        //使用 for 循环，对集合进行迭代
        val items = listOf("apple", "banana", "kiwifruit")
        for (item in items) {
            println(item)
        }
        //使用区间，使用 in 运算符来检测某个数字是否在指定区间内,闭区间
        for (x in 1..5) {
            print(x)
        }
        /**
         * 等价于for（i= 1，i<=5,i++）
         */
        //半开区间：不包含 5
        for (x in 1 until 5) {
            print(x)
        }
//-------------------------------------------------------------------------------------------
        //使用 while 循环
        var index = 0
        while (index < items.size) {
            println("item at $index is ${items[index]}")
            index++
        }
//-------------------------------------------------------------------------------------------
        //创建基本类及其实例,不需要new
        var javaClass = JavaClass();// 不需要“new”关键字
        println(javaClass.mName)
//-------------------------------------------------------------------------------------------
        //try-catch写法
        val result = try {
            Sum(2, 2, 3);
        } catch (e: Exception) {
            throw Exception(e)
        }
//-------------------------------------------------------------------------------------------
//Kotlin 在设计时就考虑了 Java 互操作性。可以从 Kotlin 中自然地调用现存的 Java 代码
//在 Java 代码中也可以很顺利地调用 Kotlin 代码。
    }

    /*
     * 方法名：Sum
     * 参数Int类型，a
     * 参数Int类型，b
     * 返回类型为Int类型
     */
    fun Sum(a: Int, b: Int): Int {
        return a + b
    }

    //函数的默认参数
    fun Sum(a: Int = 0, b: Int = 1, c: Int = 2): Int {
        return a + b + c
    }

    //在子类里重写父类的方法需要使用override关键字描述方法，接口监听按键方法
    override fun onClick(view: View?) {
        when (view?.id) {
            //View.id
        }
    }
}
