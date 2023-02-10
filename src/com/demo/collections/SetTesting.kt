package com.demo.collections


fun main(args:Array<String>) {


    // order not maintained
    val myhashSetOf = hashSetOf<Int>()// Mutable | not fixed  | read and write | not sequential output
    // order is maintained
    val mymutableSetOf = mutableSetOf<Int>()// Mutable | not fixed  | read and write
    // order is maintained
    val mysetOf = setOf<Int>(18,16,7,7,5)// Immutable | not fixed  | read only



    myhashSetOf.add(5)
    myhashSetOf.add(6)
    myhashSetOf.add(7)
    myhashSetOf.add(40)
    myhashSetOf.add(0)
    myhashSetOf.add(9)
    myhashSetOf.add(1)

    mymutableSetOf.add(5)
    mymutableSetOf.add(6)
    mymutableSetOf.add(70)
    mymutableSetOf.add(0)
    mymutableSetOf.add(9)



    println("myhashSetOf--> ")

    myhashSetOf.add(100)

    for (element in myhashSetOf){

        print("$element \t")
    }
    println()

    println("mymutableSetOf--> ")


    mymutableSetOf.add(100)

    for (element in mymutableSetOf){

        print("$element \t")
    }
    println()

    println(" mysetOf--> ")

   // mysetOf[2] = 1  not possible since it is immutable


    //mysetOf.add not possible since it is immutable


    for (element in mysetOf){

        print("$element \t")
    }



    println()

    println(" Using for each mysetOf--> ")
    mysetOf.forEach { e ->
        println(e)
    }

}