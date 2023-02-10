package com.demo.highlevelfunctions


class Users(var name:String,var age:Int){}


fun main(args:Array<String>) {


    var myList = arrayListOf<Users>()
    myList.add(Users("Akash",30))
    myList.add(Users("Akki",27))
    myList.add(Users("Sonu",35))
    myList.add(Users("Dhoni",10))




    // Filtering object with Even Age
   var  withEvenAge = myList.filter { it.age%2==0 }
    for(obj in withEvenAge){
        println("${obj.age}")
    }


    // Filtering object with Even Age as well as transforming
    var  withA = myList.filter { it.age%2==0 }.map{it.name+" Saha"}
    for(obj in withA){
        println("${obj}")
    }

    println(withA.get(0).toString())
}


