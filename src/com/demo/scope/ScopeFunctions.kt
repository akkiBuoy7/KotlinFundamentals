package com.demo.scope



class Person(var name:String , var age:Int){
    fun sampleFun(){
        println("sample fun")
    }
}

class Person1(){
    var name:String? = null
    var age: Int? = null
    fun sampleFun(){
        println("sample fun")
    }
}






fun main(args:Array<String>) {

    // Normal way
    println("using normal way--------------------")
    val p1 = Person("Akash",30)
    println("Name:${p1.name} Age:${p1.age} ")
//############################################################################################################


    // apply -->
// return : context
// context : this

    val p2 = Person("Akash",30)
    val apply_result=p2.apply{
        println("using apply to Create an Object--------------------")
        this.age = 29
        this.name = "Sonu"
    }.sampleFun()   // using apply we can call the class fun

    println("Name:${p2.name} Age:${p2.age} ")
    println("apply context result: Name:${apply_result} Age:${apply_result}")
    println(apply_result) // this will not work



    //############################################################################################################


// with -->
// return : lambda result
// context : this

    // with helps to work something with the object
    //val p2 = Person("Akash",30)
    val with_result=with(p2){
        println("using with to change Values of the object-----------------------")
        this.age = 100
        this.name = "Sonu1"
        "with lambda result: Name:${this.name} Age:${this.age} "
    }
    println(with_result)

//############################################################################################################
// also -->
// return : Context result
// context : it

    // also allows to work further with the object
    val also_result=p2.also{
        println("using also to work further on the same object-----------------------")
        it.age = 291
        it.name = "Sonu1"
        "also lambda result: Name:${it.name} Age:${it.age} "
    }
    println("Name:${also_result.name} Age:${also_result.age} ")


//############################################################################################################


// run -->
// return : lambda result
// context : this
    val p4 : Person1? =Person1()


    // This is not possible because p4 object is of null type
//    val run_result=with(p4){
//
//        println("using with-----------------------")
//        println("Name:${p1.name} Age:${p1.age} ")
//        this.age = 29
//        this.name = "Sonu"
//        "with lambda result: Name:${this.name} Age:${this.age} "
//    }
//
//    println(run_result)




    // So use run only if object is nullable else use with
    val run_result=p4?.run{
        println("using run-----------------------")
        this.age = 29
        this.name = "Sonu"
        "run lambda result: Name:${this.name} Age:${this.age} "
    }

    println(run_result)
//############################################################################################################





//############################################################################################################



    val myList1 = mutableListOf<Int>(1,5,7,9,10)

        println("using normal way--------------------")
        println("original list: $myList1")

        myList1.add(100)

    println("Duplicate list: $myList1")



// also -->
// return : lambda result
// context : it

    val myList = mutableListOf<Int>(1,5,7,9,10)

    val duplicateList = myList.also {
        println("using also--------------------")
        println("original list: $it")
        it.add(100)
    }

    println("Duplicate list: $duplicateList")


    val duplicateList1 = myList.apply {
        println("using apply--------------------")
        println("original list: $this")
        this.add(555)
    }

    println("Duplicate list: $duplicateList1")


//    val duplicateList2 = myList.let {
//        println("using let--------------------")
//        println("original list: $it")
//        it.add(132)
//    }
//
//    println("Duplicate list: $duplicateList2")

//############################################################################################################


// let -->
// return : lambda result
// context : it
  println("using let--------------------")
  var sample : String? = "Akash"
  sample?.let { "Value is not null" } // this will not execute as value is null
  val sample_length = sample?.let { "Value is not null"
      println(it.reversed())
      it.length
  }
    println("Length of $sample using let : $sample_length")



    println("using run--------------------")
    var sample1 : String? = "Akash"
    val sample_length1 = sample1?.run { "Value is not null"
        println(this.reversed())
        this.length
    }
    println("Length of $sample1 using let : $sample_length1")




}
