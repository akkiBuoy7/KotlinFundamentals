package com.demo.classes


class Address{

    var city:String // can use lateinit and initialise in secondary const
    val state:String // can not be initialised in secondary if primary const present.Can not use lateinit


    // if Primary constructor is used then we should always
    //initialize variables in here
    // we can use lateinit for var but can not for val
    // so a val should always be initialised in primary const
    // if we want to initialse it in secondary cons then
    // we need to completely get rid of primary const

//        constructor(){
//
//        }

    constructor(param1:String,param2:String){
        city = param1
        state= param2
    }


//        fun test(){ // can not initalise val here in func
//            state = ""
//        }


    fun test(){

        println("My state is $state and city is $city")
    }

}