package com.demo.`interface`

class Dog(var name:String): DomesticAnimal(),ClimberLevel {



    //overriding interface properties as class properties
    override val climberLevel: String = "Good"
    override val animalName: String=name
    override val dangerLevel: String="Low"

    override fun animalType() {
        println("$name is a ${dangerLevel} level carnivore")
    }


    override fun swim(level: String) {
        println("$animalName is a $level level swimmer")
    }
}