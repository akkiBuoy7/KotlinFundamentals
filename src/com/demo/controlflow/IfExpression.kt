package com.demo.controlflow



fun main (args:Array<String>){


    var a= 5
    var b = 6

    // Using if as expression to directly return a value to set into the variable

    var max_value:Int = if(a>b){
                                println("a is greater than b")
                                a
                                }else{
                                println("b is greater than a")
                                b}

    println(max_value)

}