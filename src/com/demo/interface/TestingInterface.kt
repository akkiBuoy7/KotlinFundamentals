package com.demo.`interface`


fun main(args: Array<String>) {




    val cat: Cat = Cat("Low","Cat","High","Cat")

    cat.animalType()
    cat.climb()
    cat.swim("Low")

    val tiger : Tiger = Tiger("High","Tiger","Low","Tiger")

    tiger.animalType()
    tiger.climb()
    tiger.swim("High")


    val dog = Dog("Dog")

    dog.animalType()
    dog.climb()
    dog.swim("High")



}