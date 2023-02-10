package com.demo.highlevelfunctions



class Person1(val name:String,val age:Int){

}


// Filter takes a boolean lambda function and filters the collection
// Map takes a transform lambda function and maps on the collection

fun main(args:Array<String>) {


    val myNumbers = listOf<Int>(5,3,10,50,17,64,2)

     // val myOddNumbers = myNumbers.filter { num -> num%2==0 }
    val myOddNumbers = myNumbers.filter { it%2!=0 } // using filter with it

//    val mySquaredNumbers = myOddNumbers.map { num -> num * num }
    val mySquaredNumbers = myOddNumbers.map { it * it } // squaring odd nums using map

    println("Using map and filter seperately")

    for (i in mySquaredNumbers){

        print("$i \t")

    }

    println()
    println("Using map and filter together")

    val myOddSquaredNumbers = myNumbers.filter { it%2!=0 }.map { it*it }
    for (i in myOddSquaredNumbers){

        print("$i \t")

    }


    println()
    println("Using map and filter together")

    val myOddSquaredNumbers1 = myNumbers.map { it*it  }.filter {it>90}
    for (i in myOddSquaredNumbers1){

        print("$i \t")

    }


    println()
    println("Using map and filter together for class object list")

    val p = listOf<Person1>(Person1("Akash",10), Person1("Sonu",20), Person1("Akki",30))

    val elements = p.filter { it.name.startsWith("A") }.filter { it.age>10 }.map { it.name } // using filter twice

    for (i in elements){
        print("$i \t")
    }



}