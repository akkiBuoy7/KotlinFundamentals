package com.demo.`interface`

interface A {


    fun foo()

}

interface B:A { // Multiple inheritence of interface A

    override fun foo() {
        println("This is B")
    }
}

interface C:A{  // Multiple inheritence of interface A


    override fun foo() {
        println("This is C")
    }
}
    class D : B,C{  // implements both interfaces that has A as parent

        override fun foo() {
            println("This is D")


        }

        fun foo1(){
            super<B>.foo()  // Have the option to implement interface wise incase of multiple inheritence
            super<C>.foo()
        }

    }

fun main(args:Array<String>) {
    val d= D()
    d.foo()
    d.foo1()

}


