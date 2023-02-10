package com.demo.classes




class PersonName(val name:String?) { // have to use the inner class as constructor param



    var address:MyAddress? = null

    inner class MyAddress(
        val street:String,
        val city : String,
        val state : String,
        val pin: Int){

        val contextName = name  // outer class variable can be accessed within inner class but can't be accessed within fun of inner class


        fun displayDetails(){ // using inner class temporary variable to access the outer class variable inside the func of inner class
            println("${this.contextName},${this.street},$city,$state,$pin ")
        }

    }


}


fun main(args:Array<String>) {

    val person = PersonName("Akash Saha")
    person.address = person.MyAddress("r.m sarani","agartala","tripura",799007) // seperate initiation for inner class obj

    person.address!!.displayDetails() // accessing inner class fun using outer class obj


}