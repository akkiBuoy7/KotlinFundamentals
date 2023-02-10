package com.demo.classes

import com.demo.scope.Person1

class Person(var firstName: String, var lastName: String,  var age: String) {

// using only primary direct constructor

    constructor() : this("firstName","lastName","age") { // the secondary constructor shd always make call to primary
    }

}