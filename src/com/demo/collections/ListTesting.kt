package com.demo.collections


fun main(args:Array<String>) {


    val myArray = ArrayList<Int>()// Mutable | not fixed  | read and write
    val myarrayList = arrayListOf<Int>()// Mutable | not fixed  | read and write
    val mymutableList = mutableListOf<Int>()// Mutable | not fixed  | read and write
    val arr = Array<Int>(5){0}// Mutable | fixed (need to declare size) | read and write
//  0 is the default value
    val myList = listOf<Int>(5,6,7)// Immutable | not fixed  | read only

   // myList.add ---> not possible since it is immutable | read only

    myArray.add(5)
    myArray.add(6)
    myArray.add(7)


    myarrayList.add(5)
    myarrayList.add(6)
    myarrayList.add(7)

    mymutableList.add(5)
    mymutableList.add(6)
    mymutableList.add(7)

    arr[0] = 5
    arr[1] = 6
    arr[2] = 7


    println(" listOf--> ")

    for (element in myList){

        print("$element \t")
    }
    println()
    println( "arrayListOf-->" )

    for (element in myarrayList){

        print("$element \t")
    }
    println()

    println("mutableListOf--> ")


    for (element in mymutableList){

        print("$element \t")
    }
    println()

    println(" ArrayList--> ")


    myArray[2] = 1


    for (element in myArray){

        print("$element \t")
    }

    println()


    println(" Array--> ")

    for (element in arr){

        print("$element \t")
    }

    println()

    arr[2] = 1

    for (element in arr){

        print("$element \t")
    }

    println()
    mymutableList[2] = 1


    for (element in mymutableList){

        print("$element \t")
    }

    println()

    // indexing
    for (i in 0..mymutableList.size){

        print("$i \t")
    }

    // myList[2] = 1 // not possible since listOf is immutable
}