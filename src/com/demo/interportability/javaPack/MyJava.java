package com.demo.interportability.javaPack;

import com.demo.interportability.kotlinPack.MyKotlin;
import kotlin.jvm.JvmOverloads;

public class MyJava {


    public int w,x;


    public MyJava(){

    }

    public MyJava(int w,int x){
        this.w = w;
        this.x = x;
    }

    public String addJ(int a,int b){
        return "Java meth>>> sum is "+(a+b);
    }

    public String multiplyJ(){
        return "Java meth>>> product is "+(w*x);
    }



    public static void main(String[] args) {


        MyKotlin myKotlin = new MyKotlin();
        System.out.println( myKotlin.addK(5,7));


        MyKotlin myKotlin1 = new MyKotlin(5,7);
        System.out.println(myKotlin1.multiplyK());

        // no default param in java,so it will not work
        // so need to use JvmOverloads in kotlin method signature
        //myKotlin.volume(5,6)


        String result = myKotlin.volume(5,9);
        System.out.println(result);

    }

}
