package com.demo.extensions

import java.lang.StringBuilder


fun stringReverser(input:String?):String{
    if (input!!.length>0){

        var temp = input.split(" ")
        var newString = StringBuilder()
        for (i in temp.indices.reversed()){


            newString.append(temp[i]+" ")
        }
        return newString.toString()

    }else{
        return input
    }
}

fun String.stringReverserExtension():String{   /// method is set as extension of String class.

    if (this!!.length>0){ // we can use this instead of a method param as this refers to the string class itself

        var temp = this.split(" ")
        var newString = StringBuilder()
        for (i in temp.indices.reversed()){


            newString.append(temp[i]+" ")
        }
        return newString.toString()

    }else{
        return this
    }
}


class Universe{


    var name = "galaxy"


    fun foo(){
        println("This is universal foo")
    }

}


fun Universe.foo(){

    println("This is Universe extension foo")


}


fun Universe.oof(){

    println("This is Universe extension oof")


}


fun Universe.oof1(obj:Universe){

    println("This is Universe extension ${obj.name}")


}




fun Int.isGreater(a:Int):String = if(this>a) "$this is greater than $a" else "$a is greater than $this"

fun main(args:Array<String>) {


    var sentence = "I am Working"
    println(stringReverser(sentence)) // without extension


    // Any string can directly use this method
    println(sentence.stringReverserExtension()) // with extension of the String class


    val universe = Universe()

    universe.foo() // the original foo method will be called and not the extension foo method as method name and signature of both are same
    universe.oof() // the extension oof method will be called of the class Universe



    val universe2 = Universe()

    universe2.oof()
    universe2.oof1(universe2)// passing parent object as a param to the extension method



    val a= 9
    val b = 10
    println(a.isGreater(b))


}



