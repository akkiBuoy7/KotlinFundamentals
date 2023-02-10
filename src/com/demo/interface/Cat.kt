package com.demo.`interface`



// implementing interface properties as constructor parameters
// danger level and fun animalType ----> overriding belongs to parent abstract class DomesticAnimal
// climberLevel and swim ---->  overriding belongs to interface ClimberLevel
class Cat(override val dangerLevel: String, var name:String, override val climberLevel: String,
          override val animalName: String
) : DomesticAnimal() , ClimberLevel { // extending DomesticAnimal and implementing ClimberLevel

    override fun animalType() {
        println("$name is a ${dangerLevel} level carnivore")
    }

    override fun swim(level: String) {
        println("$name is a $level level swimmer")
    }
}