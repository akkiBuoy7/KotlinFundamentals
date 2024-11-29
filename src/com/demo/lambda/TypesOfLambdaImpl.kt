package com.demo.lambda

// implementing lambda as variable
class Adapter{
    var action : ((Int) -> Unit)? = null
    fun onViewInteraction(pos:Int){
        action?.invoke(pos)
    }
}

// implementing lambda as function parameter
class Adapter2{
    fun onViewInteraction(pos:Int,action : ((Int,String) -> Unit)? = null){
        action?.invoke(pos,"View Clicked at")
    }
}

// implementing lambda as constructor parameter
class Adapter3(private val  action : ((Int, String) -> Unit)? = null){
    fun onViewInteraction(pos:Int,){
        action?.invoke(pos,"View Clicked at")
    }
}

// implementing lambda as return type of another function
class Demo{

    fun addTwoNumbersFunc(str:String):((Int,Int) -> String){
        return {x,y -> "$str ${x+y}"}
    }
}

fun main(){

    // invoking as class variable
    val adapter = Adapter()
    adapter.action = {
        println("View clicked at $it")
    }
    adapter.onViewInteraction(7)

    // invoking as method param
    val adapter2 = Adapter2()
    adapter2.onViewInteraction(5) { pos, str ->
        println("$str $pos")
    }


    // invoking as constructor param
    val adapter3 = Adapter3 { pos, str ->
        println("$str $pos")
    }
    adapter3.onViewInteraction(3)

    // invoking lambda as return type of a function
    val d  = Demo()
    val foo = d.addTwoNumbersFunc("Result is")
    val result = foo.invoke(5,6)
    print(result)
}
