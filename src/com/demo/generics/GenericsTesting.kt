package com.demo.generics

/*
Simple generic class with T
 */
class MyGeneric<T>(val value:T){

    fun getValueRuntimeType(){
        println("This is of type ${value!!::class.simpleName}")
    }


}

/*
 Invariance in kotlin generics ::
 In Kotlin, generics are invariant by default, meaning a type Array<Dog> is not considered a
 subtype of Array<Animal>, even if Dog is a subclass of Animal. This is a departure from Java,
 where in java, generics are covariant by default for certain collections (like Array<T>),
 allowing Array<Dog> to be treated as a Array<Animal>

 List , Set etc are covariant and works.
 */

open class Animal(open var type:String = "Animal"){
    fun getTypeOfAnimal(){
        println("This is of type $type")
    }
}
class Dog(override var type:String) : Animal(type)


class Invariance{
    private val dogs: Array<Dog> = arrayOf(Dog("dog"), Dog("dog"))
    // private val animals: Array<Animal> = dogs  // ERROR SINCE ARRAY IS INVARIANT
    fun getList(){
       // println(animals)
    }
}

/*
 COVARIANCE
 Producer using out :
 To allow a covariant relationship (i.e., where List<Dog> can be treated as List<Animal>),
 you can use the out keyword. The out keyword is used to indicate that a generic type
 is allowed to only produce (return) values of that type,but not consume (take) values.
 This makes the type read-only and allows it to be treated as a subtype of a more general type.

 Any Supertype reference variable can be assigned Subtype variable
 */

class ProducerArray<out T>(private val items: Array<T>) {
    fun getItem(index: Int): T = items[index]

//    fun consume(item: T) {  // T can not be used as the method param since it is of out type
//        println(item)
//    }
}

class OutCovariance{
    private val dogArray = arrayOf(Dog("dog 1"),Dog("dog 2"),Dog("dog 3"))
    private val animalArray = arrayOf(Animal("animal 1"),Animal("animal 2"),Animal("animal 3"))

    var dogProducer : ProducerArray<Dog> = ProducerArray(dogArray)
    // supertype animalProducer assigned with subtype dogProducer
    var animalProducer : ProducerArray<Animal> = dogProducer // this possible because out is used

}

/*
 CONTRAVARIANCE
 Consumer using in :
 On the flip side, the in keyword makes a type contravariant, meaning it can accept (consume) values
 of a more specific type, but it can't return them. Contravariance is useful when you are dealing with
 functions that need to take parameters of a more general type, but don't necessarily need to return them.

 Any Subtype reference variable can be assigned Supertype variable
 */

class ConsumerArray<in T>(private val items: Array<T>) {
    //fun getItem(index: Int): T = items[index] //// T can not be used as the return type since it is of in type

    fun consume(item: T) {
        println(item)
    }
}

class InContravariance {

    private val dogArray = arrayOf(Dog("dog 1"),Dog("dog 2"),Dog("dog 3"))
    private val animalArray = arrayOf(Animal("animal 1"),Animal("animal 2"),Animal("animal 3"))

    var animalConsumer : ConsumerArray<Animal> = ConsumerArray(animalArray)
    // subtype dogConsumer is assigned with supertype animalConsumer
    var dogConsumer : ConsumerArray<Dog> = animalConsumer  // this is possible because in is used

}


fun main(){
    /*
    Sending two types of data as T
     */
    val obj = MyGeneric("Akash")
    obj.getValueRuntimeType()
    val obj1 = MyGeneric(7)
    obj1.getValueRuntimeType()


    val animal = OutCovariance().animalProducer.getItem(0)
    println("Dog array changed to animal array using out ${animal.type}")
    // consumer can not return the value , just store it
    InContravariance().animalConsumer.consume(animal)



}