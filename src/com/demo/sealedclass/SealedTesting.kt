package com.demo.sealedclass

// Sealed Student class can not be extended here as constructor of sealed class is private

//class PostDoctorate: Student(){
//
//}

fun main(args:Array<String>) {

    val me:Student = UnderGraduate("") // variable type is student so that all the child classes can be used as cases in when loop

    when(me){  // Like Enum no need to use else case

        is UnderGraduate -> me.print()
        is PostGraduate -> me.print()
        is Doctorate -> me.print()
    }

    me.p()

}
