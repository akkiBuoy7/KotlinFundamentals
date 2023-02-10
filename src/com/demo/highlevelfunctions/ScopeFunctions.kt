package com.demo.highlevelfunctions

import javax.print.attribute.IntegerSyntax


class Person(){

     var name:String = ""
     var age:Int = 0

    constructor(n:String,a:Int) : this() {
        this.name = n
        this.age = a
    }

    fun action(){
        println("Using apply: ${name},${age}")
    }

    fun action1(){
        println("Using simple way: ${name},${age}")
    }

    fun details(n:String,a:Int){
        println("Name is $n and age is $a")
    }
}

fun main(args:Array<String>) {


    val  p = Person("Akash",30)

    p.action1()

    // context = this
    with(p){
        this.name = "Sonu"
        this.age = 21
        println("Using with: ${p.name},${p.age}")
    }



    // with returns lambda result
    var ageAfter5Years:Int = with(p){

        this.age = 20
        this.age + 5
    }
    println("With returning a lambda result value $ageAfter5Years")

    // context = this
    p.apply {
        this.name = "Sonu"
        this.age = 21

    }.action()  // using non paramaterised method using apply


    var name = "Akki"
    var age = 29
    p.apply {
        this.name = name
        this.age = age
    }.details(name,age)   // using paramaterised method using  apply


    // apply returns object
    val person1 = Person().apply {
        this.name = "Sonu Saha"
    }
    print("Apply Result--->")
    println(person1.name)


    //also returns object

    val person2 = Person().also {

        it.name = "Dhoni"
        it.age = 39

        println("name is ${it.name} and age is ${it.age}")
    }
    println("name is ${person2.name} and age is ${person2.age}")


    var list = mutableListOf<Int>(1,2,3,4,5)
    println("Original list ${list.toString()}")

    var duplicatelist = list.also {
        list.remove(2)
        list.add(1,10)
    }
    println("Duplicate list ${duplicatelist.toString()}")



    // run is a combination of both with and let
    // it is used on nullable objects

    var personN:Person? = Person() // the object is nullable

    // returns lambda result
    val bio = personN?.run {
        this.name = "akash"
        this.age  = 29
        "name is ${this.name} and age is ${this.age}"
    }
    println(bio)


}