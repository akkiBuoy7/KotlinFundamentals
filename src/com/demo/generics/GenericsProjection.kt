package com.demo.generics



open class Fruit(){

    open fun getColor():String{
        return "Fruit color"
    }

    open fun getVitaminC():String{
        return "Fruit vitamin c"
    }
}

open class Orange() : Fruit(){
    override fun getVitaminC(): String {
        return "Orange vitamin c"
    }

    override fun getColor(): String {
        return "Orange color"
    }
}

open class Apple() : Fruit(){
    override fun getVitaminC(): String {
        return "Apple vitamin c"
    }

    override fun getColor(): String {
        return "Apple color"
    }
}

class MandarinOrange : Orange(){
    override fun getVitaminC(): String {
        return "high vitamin C"
    }
}
class Crate<T> {
    private val items = mutableListOf<T>()
    fun produce(): T = items.last()
    fun consume(item: T) = items.add(item) // to consume item
    fun size(): Int = items.size // independent function
}
/*
  Projecting as out class:
  can produce
  can not consume
  can use independent function
 */
fun useAsProducer(producer: Crate<out Fruit>) {
    // can not add item in producer
    //producer.items.add(Orange())
    // T is known to be out Fruit, so produces Fruit and its subtypes.
    val fruit = producer.produce()           // OK

    // Fruit is guaranteed. Can use functions and properties of Fruit.
    val c = fruit.getColor()                         // OK
    println(c)
    // Consumer not allowed because you don't want to accidentally add
    // oranges, if this is a Crate<Apple>
    //producer.consume(Orange("orange"))               // Error

    println("The size is ${producer.size()}")
}

/*
  Projecting as in class:
  can consume
  can not produce
  can use independent function
 */

fun useAsConsumer(consumer: Crate<in Orange>) {

    // Produces Any?, no guarantee of Orange because this could
    // be a Crate<Fruit> with apples in it.
    val anyNullable = consumer.produce()     // Not useful

    // Not safe to call functions of Orange on the produced items.
    //anyNullable.getVitaminC()                // Error

    // T is known to be in Orange, so consumes Orange and its subtypes.
    consumer.consume(MandarinOrange()) // OK

    println("The size is ${consumer.size()}")
}

/*
  can not produce
  can not consume
  can use the independent function
 */
fun useAsStar(star: Crate<*>) {

    // T is unknown, so the star produces the default supertype Any?.
    //val anyNullable = star.produce()         // Not useful

    // T is unknown, cannot access its properties and functions.
    //anyNullable.getColor()                   // Error

    // Cannot consume because you don't know the type of Crate.
    //star.consume(Fruit())                    // Error

    // Only use the T-independent functions and properties.
    println("The size is ${star.size()}")                             // OK
}

/*
  When you say Crate<Any>, you are not projecting, you are simply using
  the original invariant class Crate<T> as it is, which can produce as well as consume Any:
 */
fun useAsAny(any: Crate<Any>) {

    // T is known to be Any. So, an invariant produces Any.
    val anyNonNull = any.produce()           // OK

    // T is known to be Any. So, an invariant consumes Any.
    any.consume(Fruit())                     // OK

    // Can use the T-independent functions and properties, of course.
    println("The size is ${any.size()}")                                 // OK
}

fun  main(){
    val crateOut  = Crate<Orange>()
    crateOut.consume(Orange())
    useAsProducer(crateOut)

    val crateIn = Crate<Orange>()
    crateIn.consume(MandarinOrange())
    useAsConsumer(crateIn)

    val crateStar = Crate<Apple>()
    crateStar.consume(Apple())
    useAsStar(crateStar)

    val crateAny = Crate<Any>()
    crateAny.consume(MandarinOrange())
    useAsAny(crateAny)


}