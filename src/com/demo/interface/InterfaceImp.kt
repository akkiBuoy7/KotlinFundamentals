package com.demo.`interface`

interface ClickListener{

    // abstract method
    fun onClick(pos:Int)
    // concrete method
    fun onLongClick(pos:Int){
        println("On Long click pressed at $pos")
    }
}

class Adapter(val clickListener: ClickListener){

    fun onViewInteraction(pos:Int){
        clickListener.onClick(pos)
    }
}

class Adapter2:ClickListener{
    override fun onClick(pos: Int) {
        println("On click in Adapter2 pressed at $pos")
    }
}

fun main(){

    // creating object of interface to pass through adapter constructor
    val listener = object : ClickListener{
        override fun onClick(pos: Int) {
            println("On click pressed at $pos")
        }
    }

    val adapter = Adapter(listener)
    adapter.onViewInteraction(7)
    listener.onLongClick(5)


    // creating object of interface directly
//    val adapter2 = Adapter(object :ClickListener{
//        override fun onClick(pos: Int) {
//            println("On click pressed at $pos")
//        }
//    })
//    adapter2.onViewInteraction(7)
//    listener.onLongClick(5)

    // Simple implementation
    val adapter2 = Adapter2()
    adapter2.onClick(3)
}