package com.demo.abstraction

import com.demo.inheritence.Dog
import com.demo.inheritence.DomesticAnimal
import com.demo.inheritence.Tiger

// abstract class
abstract class Animal{

    abstract fun makeSound() // abstract method
    abstract val animalType : String // abstract variable

}

                         // 1st way to implement the abstract variable
                         // implementing a second variable habitat and making it open to allow overriding in subclass
open class AquaticAnimal(override val animalType: String,open val habitat:String) : Animal(){
    override fun makeSound() {
        println("${this.animalType} is making sound in ${this.habitat}")

    }

}



// pass the abstarct variable as constructor parameter for both subclass and parent class
class Whale(animalType: String,override val habitat: String) : AquaticAnimal(animalType,habitat){


    override fun makeSound() { // here we overriden explicitly.Even if we don't override , it is fine as immediate parent is a concrete class
        println("${this.animalType} is making sound in ${this.habitat}")
    }



}



// extending abstract class in a concrete class
open class DomesticAnimal: Animal() {
    override fun makeSound() {
        println("Make domestic sound")  // implementing abstract class method
    }

    override val animalType: String    // 2nd way to implement the abstract variable
        get() = "Set any value to abstract animal type variable"
}


// abstract class extending abstract class
abstract class WildAnimal : Animal(){ // abstract class extending abstract class need not implement the abstract members

    // abstract class having both concrete and abstract members or functions

    abstract fun animalColor()  // abstract method

    fun concreteMethod(){  // concrete method
        println("This a concrete method")
    }
}

class Tiger(override val animalType: String) : WildAnimal() { // Concrete class extending abstract class needs to implement the abstract members

    // WildAnimal class is abstract and has abstract parent Animal
    // so extending it will ask us to implement the Animal class as well as WildAnimal class abstract members

    override fun makeSound() {

        println("Make roaring sound") // implementing abstract class method of Secondary parent
    }

    override fun animalColor() {

        println("Carnivore Animal") // implementing abstract class method of Primary parent

    }


}

class Dog:com.demo.abstraction.DomesticAnimal(){



    // DomesticAnimal class is open so extending it will not ask us to implement the Animal class abstract members

    // But WildAnimal class is abstract so extending it will ask us to implement the Animal class as well as WildAnimal class abstract members



}






fun main(args: Array<String>) {


    // Abstract class can not be initiated
//    val parentAnimal = Animal() // using parent object
//    parentAnimal.makeSound()  // parent class own method


    // Abstract class variable can be created and pointed to concrete class object
    val animal : Animal = com.demo.abstraction.Tiger("Tiger") // using parent variable and secondary child object
    animal.makeSound() // overriding

    val dog  = Dog() // using same child class object
    dog.makeSound()

    val domestic : Animal = com.demo.abstraction.DomesticAnimal()  // using parent variable and primary child object
    domestic.makeSound() // overriding

    val tiger: WildAnimal = com.demo.abstraction.Tiger("Tiger") // using immediate parent variable and secondary child object
    tiger.makeSound()





    // using the abstract method makeSound in different ways in two classes

    val whale:Animal = Whale("Whale","Sea")

    whale.makeSound()

    val aquaticAnimal:Animal = AquaticAnimal("All aquatic animal","Sea")

    aquaticAnimal.makeSound()



}
