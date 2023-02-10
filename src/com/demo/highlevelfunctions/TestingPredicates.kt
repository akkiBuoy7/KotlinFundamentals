package com.demo.highlevelfunctions



// predicates are nothing but boolean statements
fun main(args:Array<String>) {

    val myNumbers = listOf<Int>(1,5,21,36,11,9,7)

    val myPredicate = { num:Int -> num>10 } // declaring a global lambda variable

    val check1 = myNumbers.all(myPredicate)
    println("Does all the numbers are greater than 10? : $check1")

    val check2 = myNumbers.any(myPredicate)
    println("Does any number is greater than 10? : $check2")

    val num_count = myNumbers.count(myPredicate)
    println("Total numbers in the list greater than 10 are : $num_count")

    val find_1st = myNumbers.find (myPredicate)
    println("1st number in the list greater than 10 : $find_1st")

    val check3 = myNumbers.filter(myPredicate).map{it*it}.find { it>100 }
    println("find numbers greater than 10, square them, get the first value greater than 100 : $check3")
}