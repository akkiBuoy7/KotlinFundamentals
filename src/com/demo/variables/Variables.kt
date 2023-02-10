package com.demo.variables

fun main(args: Array<String>){
    var sampleValue =10

    //println("Number is :"+sampleValue)
    //println("Number is ${sampleValue}")

    var sampletype = 10.0 // by default the data type is double
    //var num : Float  = sampletype  // so we can't use Float. Typecast it to Double
    // var num : Double = sampletype // can use this


    // type casting method 1
    var num1: Float = sampletype.toFloat()
    var num2: Int = sampletype.toInt()

    //println("the datatype of sampletype changes into float is ${num1}")
    //println("the datatype of sampletype changes into Int is ${num1}")

    var mutable: String = "Hello"

    mutable = "World"
    //println("this is mutable ${mutable}")

    val immutable: String = "Hello"
     //immutable = "World"  can not reassign any value to val type variable as it is immutable.
   // println("this is immutable ${immutable}")


    var nullCheck = "hello World"

    // nullCheck = null can not assign null value as nullCheck is not of null type

    if (nullCheck==null){  // this check is not needed

       // println("we have  null value of length ${nullCheck.length}")
    }else{

       // println("we have non null value of length ${nullCheck.length}")

    }




     var nullCheck1: String? = "Hello City" // its a nullable variable type like in java so we need null check

    // println("We have a non null value of length ${nullCheck1.length}") // can not use directly

    // we have to use the safety operator always with the non null type variable
    println("We have a non null value of length ${nullCheck1?.length}") // can use now with ?


   // var nullCheck2: String = "Hello City" // its a non nullable variable type in kotlin by default so we don't need null check
    //println("We have a non null value of length ${nullCheck2.length}") // can  use directly


    var elvisCheck: String? = "hello"

    elvisCheck = null

    var stringLength: Int? = elvisCheck?.length // have to use ? with the data type Int? can't use Int datatype

   // println("the length is ${stringLength}")



    var elvisCheck1: String? = "hello"

    //elvisCheck1 = null

    var stringLength1 = elvisCheck1?.length ?: "unknown value"  // if null then use "unknown value"

    //println("the length is ${stringLength1}")






}