package com.demo.`interface`

interface ClimberLevel {


    abstract val climberLevel :String // abstract variable

    val animalName:String // abstract variable

    fun climb(){ // concrete Method
        println("$animalName is a $climberLevel level climber")
    }

    fun swim(level : String) // abstract method
}