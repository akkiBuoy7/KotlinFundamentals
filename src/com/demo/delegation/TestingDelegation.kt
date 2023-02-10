package com.demo.delegation

interface Engine{  // interface with method
    fun runsOn()
    fun transmissionOn()
}


class ElectricVehicle(val s:String):Engine {  // class implementing the interface method
    override fun runsOn() {
        println("Runs on Electricity $s")
    }
    override fun transmissionOn() {
        println("No Transmission")
    }
}


// In order to implement the interface method either we have to take interface as object or the implementing class as object
class Tesla(val electricVehicle: ElectricVehicle){  // class with it's own method but calling the
// implemented fun of interface using an object as constructor param
    fun runsOn1(){ // explicitly create a method to run the interface method
        electricVehicle.runsOn()
    }
}

class Tesla1(val engine: Engine) : Engine by engine //instead of explicit method by is used to implement the interface method
// here delegation is used by implementing the interface directly and delegating it using by "interface object"

class Tesla2(val electricVehicle: ElectricVehicle) : Engine by electricVehicle
// instead of using interface as object we can also use the implemented class as object to delegate


// we can also change the parent implementation of the interface method here
class Tesla3(var engine:Engine) : Engine by engine{
    override fun transmissionOn() { // here we can override the transmission method and change it.
        // SO it behaves like ElectricVehicle class on using delegation
        println("Transmission method changed")
    }
}

class Tesla4() : Engine by ElectricVehicle("Direct delegation without object")
// instead of using interface as object we can also use the implemented class as object to delegate



//Using by keyword or delegation methodology, Kotlin allows the derived class (Tesla1)
//to access all the implemented public methods of an interface through a specific object.
// That object can be interface itself or can be the implemented class.
// we can achieve this without object also by directly calling the constructor of the implemented class.

fun main(args:Array<String>) {


    val teslaVehicle = Tesla(ElectricVehicle("without delegation")) // without delegation by
    teslaVehicle.runsOn1() // can not directly calls the interface method implementation. Has to use native method within Tesla

    val teslaVehicle1 = Tesla1(engine = ElectricVehicle("with delegation"))  // with delegation by
    teslaVehicle1.runsOn() // directly calls the interface method implementation.

    val tesla3 = Tesla3(ElectricVehicle("with delegation"))
    tesla3.transmissionOn() // changing parent method after deligating and overriding


    val tesla4 = Tesla4()
    tesla4.runsOn()
}