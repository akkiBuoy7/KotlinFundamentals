package com.demo.sealedclass



// *** Using sealed class as an abstract class ***

//A sealed class is implicitly an abstract class which cannot be instantiated.
sealed class Student { // default primary constructor is invoked

    abstract fun print()
    abstract var demo :String
    var s : String = ""
    fun p(){
        println("Concrete Method")
    }
}


// Sealed classes can be extend within the same file only, as the constructor by default is private (no need for open)
class UnderGraduate(override var demo: String) : Student() {
    override fun print() {
        println("This is under graduate")
    }

}
// Sealed classes can be extend within the same file only, as the constructor by default is private (no need for open)
class PostGraduate:Student(){
    override fun print() {
        println("This is post graduate")
    }

    override var demo: String
        get() = ""
        set(value) {}

}


// Sealed classes can be extend within the same file only, as the constructor by default is private (no need for open)
class Doctorate(override var demo: String) : Student(){

    override fun print() {
        println("This is post Doctorate")
    }

}



// *** Using sealed class as an Enum class ***
// Declaring types directly within sealed class and hence can be used with when directly
sealed class Student1(val greet:String?=null){

    class UnderGraduate(data:String):Student1(data){
        fun print() {
            println("${greet} This is under UnderGraduate")
        }
    }

    class PostGraduate:Student1(){
        fun print() {
            println("This is PostGraduate")
        }
    }

    class Doctorate:Student1(){
        fun print() {
            println("This is post Doctorate")
        }
    }

}

sealed class NetworkResult<T>(val data:T? = null,val message:String?=null) {
    class Success<T>(data:T) : NetworkResult<T>(data) // success state will always contain data
    class Error<T>(message:String?,data:T? = null) : NetworkResult<T>(data,message) // error state may contain data and must contain message
    class Loading<T>(): NetworkResult<T>() // loading state has no data or message
}

fun eval(s: Student1) =
    when (s) {
        is Student1.UnderGraduate ->println("${s.print()}")
        is Student1.PostGraduate ->println("${s.print()}")
        is Student1.Doctorate ->println("${s.print()}")
        //else -> "else case is not require as all case is covered above"

    }

data class Demo(val name:String,val age:Int)
data class Demo2(val name:String,val age:Int)

fun main(args:Array<String>) {

    val underGraduate = Student1.UnderGraduate("Hi")
    val postGraduate = Student1.PostGraduate()
    val doctorate = Student1.Doctorate()
    eval(underGraduate)

    val demo = Demo("akash", 30)
    val demo2 = Demo2("error", 401)
    val success = NetworkResult.Success(demo)
    val error = NetworkResult.Error("Error ocuured",demo2)

    println(success.data.toString())
    println(error.message)
    println(error.data.toString())

}
