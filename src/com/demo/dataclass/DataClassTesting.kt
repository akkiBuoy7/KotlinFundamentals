package com.demo.dataclass

class WithoutData(val fName:String,val lName:String){
}

data class WithData(val fName:String,val lName:String){

    var age:Int?=null


    // We can override the toString() method to use any kind of return string for the class

//    override fun toString(): String {
//        return super.toString()
//    }
}


fun main(args:Array<String>) {

    val o1 = WithoutData("Akash","Saha")
    println("Without data: $o1")  // only the memory reference will be printed


    val o2 = WithData("Akash","Saha")
    println("With data: $o2") // here the object with var values will be printed

    // Now we can easily manipulate these values to some variables.This is called destructuring an object
    var(fName,lName) = o2

    println("With manipulation: $fName, $lName")


    // We can copy the object of a data class by changing the values of the variables in the data class

    val copyOfO2 = o2.copy("Sonu") // copy() is available for data class objects only.Here don't need to pass all the params.other params are cached

    val(fNameC,lNameC) = copyOfO2

    println("With copy manipulation: $fNameC, $lNameC")

    val w_o1 = WithoutData("Akash","Saha")
    val w_o2 = WithoutData("Akash","Saha")

    // since object references are compared so not equal
    if (w_o1==w_o2) println("without Data classes are  equal") else println("without Data classes are not equal")

    val w_o_o1 = WithData("Akash","Saha")
    val w_o_o2 = WithData("Akash","Saha")

    // since values are compared so equal
    if (w_o_o1==w_o_o2) println("with Data classes are  equal") else println("with Data classes are not equal")
}