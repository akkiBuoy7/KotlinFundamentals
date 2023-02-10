package com.demo.inline

class Inline {

    fun foo(){
        println("Normal func")
        foo1{
            println(it)
        }
        foo2({
            println(it)
        },{
            println(it)
        })

        foo3 {
            println("do something")
            //return  Using crossinline does not allow non local returns inside lambda functions
            println("do something again")
        }
    }


    // In JVM if inline keyword is not used then such a high order function will be created
    // this leads to object creation overhead
//    foo1(new Consumer<String>{
//        @override
//        public void invoke(){
//
//        }
//    });
    inline fun foo1(block:(String)-> Unit){
        println("Inline func")
        block.invoke("Hello")
    }

    // It will not allow block1 to get inlined but block will be inlined
    inline fun foo2(block:(String)-> Unit,noinline block1:(Int)-> Unit){
        println("Inline func")
        block.invoke("Hello")
        block1.invoke(7)
    }

    inline fun foo3(crossinline block:() ->Unit){
        block.invoke()
    }
}

fun main(){

    Inline().foo()
}