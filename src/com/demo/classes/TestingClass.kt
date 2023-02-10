package com.demo.classes

fun main(args: Array<String>) {


//    var person = Person("Akash","Saha","30") //primary
//    print("${person.firstName} \t ${person.lastName} \t ${person.age} \t")

//    var prof = Profession("Software Enginner") // secondary
//    print("${prof.profession} \t")

//    var comp = Company("Capital Numbers") // init
//    print(comp.company)
//    println()

    //////////////////////////////////////////////////////////////////////////

    var sample_class = SampleClass() // calling by primary
    print(sample_class)

    println()

    var sample_class1 = SampleClass("secondary") // calling by secondary
    print(sample_class1)

    println()


    var sample_class2 = SampleClass(3) // calling by tertiary // will invoke primary constructor
    print(sample_class2)

    println()


    var sample_class3 = SampleClass("","quaternary") // calling by quaternary // will invoke secondary constructor
    print(sample_class3)

    println()

    var sample_class4 = SampleClass("sample")
    // calling the function with lateinit variable invoked
    sample_class4.sampleFunction()



    ///////////////////// lateinit nuances ////////////////


//   val address = Address("Agartala","Tripura")
//    address.test()








    /////////////// Setter Getter /////////////////////////
//
//    var setGet = SetterGetter()
//
//    setGet.age =30
//    setGet.firstName = "akash"
//    setGet.lastName = "saha"
//
//
//    print("${setGet.firstName}\t ${setGet.lastName}\t ${setGet.age}\t")
//
//
//    setGet.occupation = "Software engineer" // set and get implicitely by secondary constructor
//
//    print("${setGet.occupation}")






}