package com.demo.enums


// Enum class constants used as parameter in order class
enum class CoffeeCupSize { MEGA , LARGE, MEDIUM, SMALL}

class OrderCoffee(var coffeeSize:CoffeeCupSize){
    fun result(){
        println("Your coffee order is ${coffeeSize}")

    }
}






// Enum class constants with values attached used as parameter in order class

enum class ShirtSize (val sizeValue:Int){
    XXl(sizeValue = 44),
    XL(sizeValue = 42),
    L (sizeValue = 40),
    M (sizeValue = 38)}

class OrderShirt(var shirtSize:ShirtSize){
    fun result(){
        println("Your Shirt order size is $shirtSize and with measurement ${shirtSize.sizeValue}")
    }
}





// Enum class  constants with values attached as well as abstract method attached to each constant used as parameter in order class
enum class InternetData(val price: Int) {
    data_6GB(price = 50) {
        override fun result(): String {
            return "you ordered ${data_6GB} with price ${data_6GB.price}"
        }
    },
    data_10GB(price = 100) {
        override fun result():String {
            return "you ordered ${data_10GB} with price ${data_10GB.price}"
        }
    },
    data_30GB(price = 200) {
        override fun result() :String {
            return "you ordered ${data_30GB} with price ${data_30GB.price}"
        }
    },
    data_100GB(price = 699) {
        override fun result() :String {
            return "you ordered ${data_100GB} with price ${data_100GB.price}"
        }
    };

    abstract fun result():String
}
class OrderInternet(val pack:InternetData)







fun main(args:Array<String>) {

    val order1 =  OrderCoffee(CoffeeCupSize.LARGE)
    order1.result() // calling the fun of order class with constant

    val order2 = OrderShirt(ShirtSize.L)
    order2.result() // calling the fun of order class with constant and corresponding value attached

    val order3 = OrderInternet(InternetData.data_100GB)
    println(order3.pack.result()) // calling the abstract method of enum class



    // Using a when loop to iterate through enum constants and print respective value attached to the constants
    val order4 = OrderInternet(InternetData.data_100GB)
    val result: String
    result = when( order4.pack){ // else case in not required when using Enum constants with when loop

        InternetData.data_6GB -> "Cost is ${order4.pack.price}"
        InternetData.data_10GB -> "Cost is ${order4.pack.price}"
        InternetData.data_30GB -> "Cost is ${order4.pack.price}"
        InternetData.data_100GB -> "Cost is ${order4.pack.price}"
    }

    println(result)







}
