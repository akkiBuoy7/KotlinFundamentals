package com.demo.controlflow

fun main(args: Array<String>) {


    println("With . . range operator ")

    for (i in 1..10){

        print("$i \t")

    }

    println()

    println("With range to operator")
    for (i in 1.rangeTo(10)){


        print("$i \t")
    }

    println()

    println("With down to operator")

    for (i in 10 downTo 1){


        print("$i \t")
    }
    println()

    println("With step")

    for (i in 1..10 step 2){

        print("$i \t")
    }
    println()

    println("With step and down to")

    for (i in 10 downTo  1 step 2){

        print("$i \t")
    }
    println()

    println("with until")

    for (i in 1 until 10){

        print("$i \t")
    }

    println()

    println("With until and step")

    for (i in 1 until 10 step 2){


        print("$i \t")
    }

    println()

    println("With for and array")

    val sampleArray = arrayOf(23,21,35,57,90)

    for (i in sampleArray){


        print("$i \t")

    }

    println()

    for (i in 0..sampleArray.size-1){
        print("$i -> ${sampleArray.get(i)}\t")

    }

}