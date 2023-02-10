package com.demo.tailrec

import java.math.BigInteger


fun main(args:Array<String>){

    println(fibonacci(3, BigInteger("1"),BigInteger("0")))
//    println(fibonacci(10000, BigInteger("1"),BigInteger("0"))) // need to use tailrec is need to perform high recursive iterations
    println(fibonacci1(10000, BigInteger("1"),BigInteger("0")))

}


fun fibonacci(n:Int,a:BigInteger,b:BigInteger):BigInteger{
    if (n==0){
        return b
    }else
        return fibonacci(n-1,a+b,a)
}

tailrec fun fibonacci1(n:Int,a:BigInteger,b:BigInteger):BigInteger // tailrec can perform large no of iterations
{
    if (n==0){
        return b
    }else
        return fibonacci1(n-1,a+b,a)
}


// 0 1 1 2 3 5 8 13 21