package com.demo.inheritence

class InheritenceDelegation {

    interface Swimmable{
        fun swim(){
            println("Swim!")
        }
    }

    class SwimImpl:Swimmable{
        override fun swim(){
            println("Swim!")
        }
    }

    interface Jumpable{
        fun jump(){
            println("Jump!")
        }
    }

    class JumpImpl:Jumpable{
        override fun jump(){
            println("Jump!")
        }
    }


    class Frog(swimmable: SwimImpl =SwimImpl(), jumpable: Jumpable=JumpImpl()):Swimmable by swimmable , Jumpable by jumpable
    {

    }

}

interface A {
    fun foo(){
        println("Inside A")
    }
}

interface D {
    fun foo1(){
        println("Inside D")
    }
}

interface B:A {
    override fun foo(){
        println("Inside B")
    }
}

interface C:A {
    override fun foo(){
        println("Inside C")
    }
}

class MultipleInheritence:B,C,D{
    override fun foo() {
        super<B>.foo()
    }

    override fun foo1() {
        super.foo1()
    }
}

fun main(args: Array<String>) {
    val  f = InheritenceDelegation.Frog()
    f.jump()
    f.swim()

    val c = MultipleInheritence()
    c.foo()
    c.foo1()
}