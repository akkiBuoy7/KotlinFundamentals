package com.demo.classes

class SampleClass {

    lateinit var name: String // it will get late initialized in secondary constructor

    constructor(){ // can not use class property var inside secondary constructor. To initalise property need to use 'this' within constructor body
        println("This is primary constructor")
    }

    constructor(nameType: String){
        this.name = nameType // can intialise a class property within body only inside secondary constructor
        println("This is secondary constructor")
    }

    // this is just like java used to call the default primary constructor within the secondary constructor
    constructor(type: Int):this(){ // any value initialised in the primary constructor will be called invoking this()
        println("This is tertiary constructor")
    }


    constructor(type: String,type1:String):this(type){ // any value initialised in the secondary constructor will be called invoking this(String)
        println("This is $type1 constructor")
    }


    init {
        println("This is 1st init block")
    }

    init {
        println("This is 2nd  init block")
    }

    init {
        println("This is 3rd  init block")
    }


    fun sampleFunction(){

        println("I am a $name function")


    }
}