package com.demo.filterMap

data class MotorVehicle(val type:TYPE,val name:String,val price:Int,val company:String? = null)
enum class TYPE{
    BIKE,CAR
}
fun main(){

    val bikes = listOf<MotorVehicle>(MotorVehicle(type = TYPE.BIKE,name = "Pulsar",90000),
        MotorVehicle(type = TYPE.BIKE,name = "Royal Enfield",100000),MotorVehicle(type = TYPE.BIKE,name = "Splendor",70000))

    val cars = listOf<MotorVehicle>(MotorVehicle(type = TYPE.CAR,name="XUV",2000000),
        MotorVehicle(type = TYPE.CAR,name="Alto",600000),MotorVehicle(type = TYPE.CAR,name="Tiago",900000))

    val vehicles = listOf(cars,bikes)
    println("Original List $vehicles")

    val vehiclesMapped = vehicles.flatMap { it }
    println("Mapped List $vehiclesMapped")

    val bike_filtered = vehicles.flatMap { it }.filter { it.type == TYPE.BIKE }
    println("Bike filtered $bike_filtered")

    val cars_filtered = vehicles.flatMap { it }.filter { it.type == TYPE.CAR }
    println("Cars filtered $cars_filtered")

    println("Print the bike names from list of list")

    val bike_names = vehiclesMapped.filter { it.type == TYPE.BIKE }.map { it.name }

    for (i in bike_names){
        print("$i \t")
    }

}