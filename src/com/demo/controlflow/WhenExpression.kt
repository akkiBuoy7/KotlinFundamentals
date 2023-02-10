package com.demo.controlflow


    fun main(args:Array<String>){

        // Alternative for switch
        // else is default block
        // short notation for switch
        var x:Int = 2
        when (x){
            0-> println("x is 0")
            1-> print("x is 1")
            2-> print("x is 2")
            else->{
                println("x is unknown")
            }
        }

        println()

        // else is default block
        var y:Int = 10
        when (y){
            0-> println("y is 0")
            1-> print("y is 1")
            2-> print("y is 2")
            else->{
                println("y is unknown")
            }
        }


        println()

        // using range as a case in when loop
        var z:Int = 5
        when (z){
            in 0..10-> println("z in 0 to 10")
            15-> print("z is 15")
            22-> print("z is 22")
            else->{
                println("z is unknown")
            }
        }
        println()

        // using as expression
        var w=10
        var myNum:String = when(w){
            in 1..11-> "w between 1 to 11"
            5-> "w is 5"
            else->{
                "w is unknown"
            }
        }
        println(myNum)



    }