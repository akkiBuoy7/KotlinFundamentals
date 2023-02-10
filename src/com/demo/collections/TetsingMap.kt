package com.demo.collections


fun main() {


    val myMap = mapOf<Int,String>(1 to "Akash", 2 to "Akki", 9 to "Sonu")  // Immutable | Fixed | Read only
    //myMap.put() --> Not possible since immutable

    val myHashMap = HashMap<Int,String>()  // Mutable | not Fixed | Read and Write
    val myMutableMap = mutableMapOf<Int,String>()  // Mutable | not Fixed | Read and Write
    val myHashMapOf = hashMapOf<Int,String>()  // Mutable | not Fixed | Read and Write


    myHashMap.put(1,"Akash")
    myHashMap.put(2,"Akki")
    myHashMap.put(9,"Sonu")


    myMutableMap.put(1,"Akash")
    myMutableMap.put(2,"Akki")
    myMutableMap.put(9,"Sonu")


    myHashMapOf.put(1,"Akash")
    myHashMapOf.put(2,"Akki")
    myHashMapOf.put(9,"Sonu")


    print("Using mapOf--->")
    for (element in myMap.keys){


        print("${myMap[element]} \t")
    }

    println()




    print("Using mutable Map--->")
    for (element in myMutableMap.keys){

        print("key:$element value:${myMutableMap[element]} \t")
    }

    println()


    print("Using hasMapOf--->")
    for (element in myHashMapOf.keys){

        print("key:$element value:${myHashMapOf[element]} \t")
    }

    println()


    print("Using HashMap--->")

    myHashMap.put(1,"Saha")
    for (element in myHashMap.keys){


        print("key:$element value:${myHashMap[element]} \t")
    }


    println()
    println("using for each print key")
    myHashMap.forEach(){e-> print(e.key)}
    println()
    println("using for each print value")
    myHashMap.forEach(){e-> print(e.value)}

}