package com.demo.abstraction

fun main(args:Array<String>){

    var extendAbs=ExtendAbs("var implemented inside constructor","val implemented inside constructor")

    extendAbs.demoConFunc()
    extendAbs.demoAbsFunc()

    println(extendAbs.demoAbsVar)
    println(extendAbs.demoConcVar)




    var extendAbs2=ExtendAbs2()

    extendAbs2.demoAbsVar = "var implemented outside constructor"
    println(extendAbs2.demoAbsVar)

    println(extendAbs2.demoAbsVal)

}


abstract class AbstractEg{
    abstract fun demoAbsFunc()
    abstract val demoAbsVal:String
    abstract var demoAbsVar:String

    var demoConcVar:String = "concrete variable"
    fun demoConFunc(){
        println("This is a concrete Method")
    }
}

class ExtendAbs(override var demoAbsVar: String, override var demoAbsVal: String) : AbstractEg() {
    override fun demoAbsFunc() {
        println("This is method in child class extending abstract class")
    }
}

class ExtendAbs2() : AbstractEg() {
    override fun demoAbsFunc() {
        println("This is method in child class extending abstract class")
    }
    override var demoAbsVar: String = ""

    override val demoAbsVal: String
    get() = ""

}