package com.demo.collections


fun main(args:Array<String>) {


    // array of size 5 initialized with 0 at each index
    val myArray = Array<Int>(5) { 0 } // Mutable and fixed


    myArray[1]= 25
    myArray[4] = 15

    // index = 0 1 2 3 4
   // value = 0 25 0 0 15


    for (element in myArray){

        print(" $element \t")
    }

    println()


    for (element in 0..myArray.size-1){
        print(myArray[element])
        print("\t")
    }



}