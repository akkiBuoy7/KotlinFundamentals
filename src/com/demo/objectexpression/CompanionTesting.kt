package com.demo.objectexpression

class SampleClass{

    val sample1 = "Sample 1"

    fun samplefun1(){

        println("$sample1 using normal object")

    }



    companion object { // makes all members within the block static

        fun samplefun2(){

            println("$sample2 using companion object")
        }

        val sample2 = "Sample 2"

    }
}


fun main(args:Array<String>) {

// we needed to create object of the class to access the members
    val c = SampleClass()
    c.sample1
    c.samplefun1()


// Using directly class to access variable is not possible as there is nothing like static key word in kotlin
//    SampleClass.sample1
//    SampleClass.samplefun1()

// so Companion object concept is used
    SampleClass.sample2
    SampleClass.samplefun2()

}