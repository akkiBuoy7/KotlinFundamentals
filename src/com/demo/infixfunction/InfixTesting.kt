package com.demo.infixfunction

class InfixTesting(var a:Int,var b:Int) {

}


// All infix functions are extension functions. But all extension functions are not infix
// Extension function with only one parameter can be made infix function.
//

// normal extension function
fun Int.isGreater(a:Int):String= if(this>a) "$a is smaller than $this" else "$this is smaller than $a"
// infix + extension function
infix fun Int.isGreaterInfix(a:Int):String = if(this > a) "$a is smaller than $this" else "$this is smaller than $a"


fun main(args:Array<String>){

    val inf = InfixTesting(10,20)
    println(inf.a.isGreater(inf.b))
    println(inf.a isGreaterInfix inf.b)  // no need to use braces if using infix functions


    val s=7
    println(s.isGreater(15))
    println(s isGreaterInfix 15)
}