package com.demo.inheritence

// by default classes are final, so use open to make it extendable
 open class Animal(open var livingBeing:String? = null){



     open fun makeSound(){ // use open for function to override it
         println("Make generic sound")

     }
 }

open class DomesticAnimal: Animal() {

    override fun makeSound(){  // overriding

        println("Make Domestic sound")
    }

    override
    var livingBeing: String? = ""


}

open class WildAnimal : Animal(){


    override fun makeSound() {

        println("Make wild sound")
    }

}

// in java variable overriding not possible but in kotlin we can override in following 3 ways
class Tiger(
    //override var livingBeing:String
    ): WildAnimal() {

   // override
//    var livingBeing= "tiger is a living being" // overriding a variable


//    override
//    var livingBeing: String = "tiger is a living being"


    override
    var livingBeing: String? = ""
        get() = super.livingBeing
        set(value) {
            field = value
        }

    override fun makeSound() {

        println("Make roaring sound")
    }

}

class Dog:DomesticAnimal(){

    override fun makeSound(){  // overriding
        println("Make barking sound")
    }


}

fun main(args: Array<String>) {



    val parentAnimal = Animal() // using parent object
    parentAnimal.makeSound()  // parent class own method

    val animal : Animal = Dog() // using parent variable and secondary child object
    animal.makeSound() // overridden method

    val dog  = Dog() // using same child class object
    dog.makeSound()

    val domestic : Animal = DomesticAnimal()  // using parent variable and primary child object
    domestic.makeSound() // overridden method

    val wild:Animal = WildAnimal() // using parent variable and primary child object
    wild.makeSound() // overridden method

    val tiger:Animal = Tiger() // using immediate parent variable and secondary child object
    tiger.makeSound()

    val tiger1:Animal = Tiger() // using top parent variable and secondary child object
    tiger1.makeSound()

    println(tiger.livingBeing)
}