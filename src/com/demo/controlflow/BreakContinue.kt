package com.demo.controlflow


fun main(args: Array<String>) {

//
//    for (i in 1..3){
//
//        for (j in 1..3){
//
//
//            print("i: ${i} j: ${j} \t")
//
//        }
//
//        println()
//
//    }


    //// Breaking inner loop

//    for (i in 1..3){
//
//        for (j in 1..3){
//
//
//            if (j==2) break
//            print("i: ${i} j: ${j} \t")
//
//        }
//
//        println()
//
//    }




    /// Breaking outer loop with label
//    outerloop@for (i in 1..3){
//
//        innerloop@for (j in 1..3){
//
//
//            if (j==2) break@outerloop
//            print("i: ${i} j: ${j} \t")
//
//        }
//
//        println()
//
//    }



    /////////////////////// return  is used when we are not using loop but using inline functions /////////////////////

//    listOf(1,2,3,4,5).forEach{
//        println(it)
//
//    }


//     returning with in a loop

//    listOf(1,2,3,4,5).forEach{
//
//        if (it==3) return
//        println(it)
//
//    }





   //// using return statement like continue by labelling ///////////////////////////////////
    //// only return at the boolean condition else continue using label
//
//    listOf(1,2,3,4,5).forEach myloop@{
//
//        if (it==3) return@myloop
//        println(it)
//
//    }



    //// using the default forEach label
    // It will function same as custom label,i.e will continue to loop
    listOf(1,2,3,4,5).forEach {
        if (it==3) return@forEach  // here when it=3 we are returning the same loop,so it will function like continue statement
        println(it)
    }

    listOf(1,2,3,4,5).forEach {
        if (it==3) return  // here when it=3 we are returning,so it will function like break statement
        println(it)
    }


}