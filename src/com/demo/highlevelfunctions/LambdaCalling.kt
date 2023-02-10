package com.demo.highlevelfunctions


class Programme{

        fun addTwoNumbers(a:Int,b:Int,action:(Int,Int) -> Int){ // lambda is used as param of another function
        val result:Int =  action(a,b)
        println("Total sum is $result")
    }

    fun addTwoNumbersClosures(a:Int,b:Int,action: (Int, Int) -> Unit){ // lambda is used as param of another function
        action(a,b)
    }


    fun reverseDisplay(str:String,action: (String) -> String){ // lambda is used as param of another function
        val result =  action(str)
        println(result)
    }

    fun reverseDisplayClosure(str:String,action: (String) -> Unit){ // lambda is used as param of another function
        action(str)
    }

}


fun main(args:Array<String>) {

    val o1 = Programme()


    val myLambda : (Int,Int) -> Int = {  x: Int,y:Int -> x+y} // defining lambda logic when calling the high level func that implements the lambda as param
    o1.addTwoNumbers(7,5,myLambda) /// calling method 1
    o1.addTwoNumbers(7,5,{  x: Int,y:Int -> x+y}) /// calling method 2
    o1.addTwoNumbers(7,5,{  x,y -> x+y}) /// calling method 3



    var result:Int = 0
    val o2 = Programme()
    o2.addTwoNumbersClosures(5,7,{x,y-> result = x+y}) // getting lambda result value in a variable directly
    println("Total sum using closures is $result")


    val o3 = Programme()
    var res :String=""
    o3.reverseDisplay("Hello",{s -> s.reversed()}) // general way
    o3.reverseDisplayClosure("Hello",{s -> res=s.reversed()}) // closure way
    println(res)
    // it operator can only be used if the lamda takes a single parameter
    o3.reverseDisplay("Hello",{it.reversed()}) // using it operator

}