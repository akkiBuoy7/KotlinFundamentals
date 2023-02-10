package com.demo.highlevelfunctions

import java.util.*

interface MyInterface {
    fun method(s:Int)
}

class MyClass{
    fun sum(a:Int,b:Int,action: MyInterface){  // using interface as argument
        val result = a+b
        action.method(result) // passing parameter to interface method
    }


    fun sum(a:Int,b:Int,action:(Int)->Unit){
        val s = a+b
        action(s)
    }


    fun sum(a:Int,b:Int,action:(Int,Int)->Unit){
        action(a,b)
    }
}


fun main(args:Array<String>) {



    val o1 = MyClass()
    o1.sum(5,7,object : MyInterface{ // using object to implement the interface method
        override fun method(s: Int) {
            println("By using object as fun argument we get sum $s")
        }
    })



    // Instead of creating an interface to do some task, we can directly use lambda functions to perform those tasks.

                  //(param type) -> return type = {param:param type -> funcion body}
    val myLambda : (Int) -> Unit =  { s: Int -> println("By using lambda as a fun argument we get sum $s")}
    val o2=MyClass()
    o2.sum(7,5,action = myLambda)



    o2.sum(7,5,{ s: Int -> println("By using lambda directly as a fun argument we get sum $s")})


    var result:Int = 0
    o2.sum(9,10,{x,y->result = x+y})
    println("Result by lambda function is $result")


}