package com.demo.extensions

class Radio(val frequency:String){   // Extension Receiver Class


    fun play(){

        println("Playing radio at frequency $frequency")
    }
}

class Car(val radio:Radio,val carName:String){  // Extension Dispatcher Class


    fun carNamePrint(){
        print(carName)
    }

    fun Radio.audioDetails(){  // extension function of Radio class
        carNamePrint()         // if we need to create a new method of receiver class and use  existing method of receiver class, then we can
        print(":")             // directly use the extension concept thus without creating a unnecessary function in receiver parent class
        this.play()
    }

    fun showCarAudioDetails(){
        radio.audioDetails() // calling the extension fun with in dispatcher class by using the object of receiver class
    }


}

fun main(args:Array<String>) {

    val radio = Radio("98.9")
    // radio.audioDetails()  // This can not be done as we did incase of file extension because this extension is mentioned in a dispatcher class.

    // so we need to use extension function of receiver class with in the dispatcher class as we did in showCarAudioDetails method
    // now calling the dispatcher class method that in turn implements the extension method.
    val car = Car(radio = Radio("98.9"),carName = "Tata Nexon")
    car.showCarAudioDetails()

}