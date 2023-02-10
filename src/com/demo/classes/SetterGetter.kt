package com.demo.classes

class SetterGetter {


    // since not initialized in primary constructor so give
    // lateinit to initialize in secondary constructor
     lateinit var occupation : String



    constructor(){
    }

    constructor(occu: String){
        // writing logic here in constructor will not work
        // se we need setter to explicitely write logic
        //occupation = occu.toUpperCase()
    }

    init {
       // occupation = ""
    }


    // setter and getter are implicitely given by kotlin
    // can not use lateinit with custom getter and setter,so need to initialise the var
     var firstName: String? = null
         set(value){ //for any logic setter and getter are explicitely used just below the variable name
        field = value?.toUpperCase() // logic
        println("setter of firstName invoked")
    }

    get(){
        println("getter of firstName invoked")
        return field
    }


    // can not use lateinit with custom getter and setter,so need to initialise the var
    var lastName: String? = null


    set(value){
        field = value?.toUpperCase()
        println("setter of lastName  invoked")
    }

    get() {
        println("getter of lastName invoked")
        return  field
    }



    // can not use lateinit with custom getter and setter,so need to initialise the var
    var age: Int? = null
    set(value) {
        if (value?.compareTo(18)!! <0){ // logic
            throw Exception("Person is minor")
        }else{
            println("setter of age  invoked")
            field = value
        }
    }


    get() {
        println("getter of age invoked")
        return field
    }


}