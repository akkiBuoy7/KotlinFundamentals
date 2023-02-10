package com.demo.variables

fun main(args:Array<String>) {


    var name:String? = "Akash"

    // using ?
    println("The length of the name is ${name?.length}")

    //using let (within let braces ? will be considered implicitely)
    name?.let {

        println("The length of the name is ${name.length}") // don't need to use ?
    }

    //using elvis
    println("The length of the name is ${name?.length ?: -1}") // same like ternary in java


    // using !!
    println("The length of the name is ${name!!.length}") // if name is null it will show exception. So use !! when sure that variable can not be null


    println("With null value\n")

    val name1:String? = null



    // using ?
    println("The length of the name is ${name1?.length}")

    //using let
    // if value is null no else loop is here so nothing will happen
    // if need else loop then use elvis operator
    name1?.let {

        println("The length of the name is ${name1.length}") // don't need to use ?
    }

    //using elvis
    println("The length of the name is ${name1?.length ?: -1}")


    // using !!
    println("The length of the name is ${name1!!.length}") // if name is null it will show exception. So use !! when sure that variable can not be null


}