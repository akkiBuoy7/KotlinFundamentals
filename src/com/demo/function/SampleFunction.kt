package com.demo.function

class SampleFunction {



    var age: Int = 0


    constructor(){

    }


    constructor(years:Int){

        age = years
    }


    fun method1(){

        println("Method1 without param")
    }

    fun method2(param1:String,param2:String){


        println("Method2 with $param1 and $param2")
    }


    fun method3(param:String):String{ //return type is string


        return "Method3 with $param return type"
    }

//    fun method3(param:String):Int{  // method overloading by changing return type is not possible
//
//
//        return 10
//    }


    fun method3(param1:String,param2:String):String{  // only change in param or method signature allows overloading



        return "Method3 with overloading"
    }


    fun method4 (param1: String,param2:String){

        // param1 = "value changed" // this is not possible as method params are val type

        // to reassign a value to method param we need to explicitly create a temp var variable
        var temp = param1 // need to create a temporary local variable
        temp = "value changed"

        println("Method4 param1: $temp and param2: $param2")


    }


    fun method5(param1:String="default value",param2:String):String{
        return "param1 is set to $param1 and param2 is set to $param2"
    }


    // expression function
    fun isMinor():Boolean = this.age.compareTo(18)<0    // if age is less than 18 return true
    // this is used to get the age variable of the class


    // Express function using parameter
    fun isEven(num : Int):Boolean = num%2 ==0
    // Without parameter
    fun isEven(): Boolean = this.age%2==0



    // calling a function with varag param and a second string param
    fun sum(vararg nums:Int, name:String):String{

        var sum1 =0

        for (i in nums){

            sum1 += i
        }


        return "$name is : $sum1"

    }


    // function without return type  similar to void in java
    fun noReturn(): Unit{

        println("This function has no return type")

    }




}