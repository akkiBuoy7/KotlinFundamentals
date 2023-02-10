package com.demo.function


fun main( args: Array<String>) {


    var sampleFun = SampleFunction(10)


    sampleFun.method1()

    sampleFun.method2("param 1","param 2")

    println(sampleFun.method3("string"))

    println(sampleFun.method3("param1","param2"))


    println(sampleFun.method4("param1","param2"))


    println(sampleFun.method5("param1","param2"))


    // named parameter param2 and param1 is set a default value
    println(sampleFun.method5(param2="param2 set only"))

    println("${sampleFun.age } age is minor: ${sampleFun.isMinor()}")


    println("Is Age ${sampleFun.age} even number? :${sampleFun.isEven(10)}")
    println("Is Age ${sampleFun.age} even number? :${sampleFun.isEven()}")

    println("Calling a varag sum function : ${sampleFun.sum(1,2,3,name = "Total sum")}")


    print(sampleFun.noReturn())
}


