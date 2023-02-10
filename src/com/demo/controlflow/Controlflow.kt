package com.demo.controlflow

fun main(args: Array<String>) {

// java way/////////////////////////////////////////////
    //var maxNumber: Int?
    //var num1 = 30
    //var num2 = 50

    // if (num1> num2){
    //maxNumber = num1
    //println("The max number is $maxNumber")
    // }else{
    // maxNumber = num2
    //println("The max number is $maxNumber")

    //}


    // Kotlin way////////////////////////////////////////////////////

//    var num1 = 20
//    var num2 = 70

//    var maxNumber = if (num1>num2) num1 else num2  // single line

    //println("The max number is $maxNumber")


    ///////////////// when ///////////////////////////////////
//
//    val planetPostion = 1
//    val message: String?
//
//    when(planetPostion){
//
//        0 -> message = "joking"
//        1 -> message = "Mercury"
//        2 -> message = "Venus"
//        3 -> message = "Mars"
//        4 -> message = "Earth"
//        5 -> message = "Saturn"
//        6 -> message = "Jupyter"
//        7 -> message = " Uranus"
//        8 -> message = "Neptune"
//        else -> message = "pluto"
//    }
//
//    println(message)


//     // Returning a value using when loop

//    val planetPostion = 1
//    val message: String?
//
//    message = when(planetPostion){
//
//        0 -> "joking"
//        1 -> "Mercury"
//        2 -> "Venus"
//        3 -> "Mars"
//        4 -> "Earth"
//        5 -> "Saturn"
//        6 -> "Jupyter"
//        7 -> "Uranus"
//        8 -> "Neptune"
//        else -> "pluto"
//    }
//
//    println(message)

//
//
//
//    val planetPostion = 1
//    val message: String?
//
//    message = when(planetPostion){
//
//        0 -> "joking"
//        1,2,3,4,5-> "Inside solar system"
//        6,7,8 -> "Outside solar system"
//        else -> "pluto"
//    }
//
//    println(message)


//
//    val planetPostion = 7
//    val message: String?
//
//    message = when(planetPostion){  // Using in range operator
//
//        0 -> "joking"
//        in 1..5-> "Inside solar system"
//        in 6..8 -> "Outside solar system"
//        else -> "pluto"
//    }
//
//    println(message)


    // When without case declared and using boolean as case

//    var city = "New york city"
//
//    var split_String = city.split(" ")
//
//    var message: String?
//
//    message = when {
//
//        split_String.size == 3 -> "${split_String.get(0)}${split_String.get(1)}${split_String.get(2)}"
//        split_String.size == 2 -> "${split_String.get(0)}${split_String.get(1)}"
//        else ->
//            "unknown"
//
//    }
//    println(message)


    // When without else ( using Any ) if not using else then can't return a value using message

//    val sampleValue: Any = 10.00
//
//    var message: String?
//
//
//    when(sampleValue) {
//
//        is Float -> "The value is Float"
//        is Int -> "The value is Int"
//        is Double -> "The value is Double"
//    }
//
//
//

//    var sampleValue : Any = 10.0
//
//    var message : String?
//
//    message = when(sampleValue){
//
//        is Float -> "is Float"
//        is Int -> " is Int"
//        is Double -> "is Double"
//
//        else -> "is Long" // else block is needed here
//    }
//
//    println(message)
//
//
//


}

