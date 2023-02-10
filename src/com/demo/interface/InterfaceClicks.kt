package com.demo.`interface`

class InterfaceClicks {
    fun addTwoNumbers(a:Int,b:Int,action:MyClick){
        var sum = "Sum is ${a+b}"
        action.onClick(sum)
    }
}


fun main(args:Array<String>){
    val obj= InterfaceClicks()
    obj.addTwoNumbers(5,9,object : MyClick{ // instead of creating a Interface object like in java here we used the object class to implement the interface
        override fun onClick(result: String) {
            println(result)
        }
    })
}


interface MyClick{
    fun onClick(result:String)
}