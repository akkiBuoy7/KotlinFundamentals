package com.demo.objectexpression

 abstract class Vehicle(){
    abstract fun runsOn()
}

interface Combined{
    val vehicle : String
    fun combineRun()
}


// Instead of using a dedicated class for a simple function to execute we can use Object expression as anonymous class and call the function
//class EletricCar:Vehicle(){
//
//    override fun runsOn() {
//        println("It runs on Electricity")
//
//    }
//}

object MyStatic{


    val testName:String="This is a static variable"

    fun testFun(){

        println("This is static function")
    }

}

fun main(args: Array<String>) {

//    val veh = EletricCar()
//    veh.runsOn()


    val veh = object :Vehicle(){  // using object expression to implement a class and it's method
        override fun runsOn() {
            println("It runs on Electricity")
        }
    }



    val veh1 = object :Vehicle(),Combined{ // using object expression to implement a class as well as interface with variable and methods
        override fun runsOn() {
            println("It runs on Electricity")
        }

        override val vehicle: String
            get() = "Combined Vehicle"

        override fun combineRun() { // interface method
            println("$vehicle runs on both fuel and electricity")
        }
    }
    veh.runsOn()
    veh1.combineRun()
    val obj = object { // acts as anonymous class
        fun foo(){
            println("using object to without extending any class")
        }
    }
    obj.foo()


    println(MyStatic.testName) // using static variable
    MyStatic.testFun() // using static function
}