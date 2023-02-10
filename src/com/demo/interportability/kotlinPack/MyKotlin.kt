package com.demo.interportability.kotlinPack

import com.demo.interportability.javaPack.MyJava

class MyKotlin(){ // primary constructor

    var w:Int = 0
    var x:Int = 0


//    constructor(){
//       // just to create a default object.
//       // kotlin implicitely does not create default constructor
//       // we can create primary constructor here or can define it in the class signature with ()
//
//    }


    constructor(param1:Int,param2:Int) : this() {
        this.w = param1
        this.x = param2
    }

    fun addK(a:Int,b:Int):String = "Kotlin fun>>> sum is ${a+b}"
    fun multiplyK():String = "Kotlin fun>>> product is ${w*x}"
    @JvmOverloads // will allow default param in java file method calling
    fun volume(j:Int,k:Int,l:Int=10):String = "Kotlin fun>>> volume is ${j*k*l}"
}


fun main(args:Array<String>){

    val myJava = MyJava()
    println(myJava.addJ(3,9))


    val myJava1 = MyJava(3,9)
    println(myJava1.multiplyJ())

}

