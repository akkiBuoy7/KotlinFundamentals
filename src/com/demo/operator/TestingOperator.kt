package com.demo.operator

data class Pen(val inkColor:String){
    fun showPen(){
        println(inkColor)
    }
}

// without operator
//fun Pen.plus(otherPen:Pen):Pen{
//    val s = "${this.inkColor} and ${otherPen.inkColor}"
//    return Pen(s)
//}

//with operator
// corresponding operator for plus is '+'
infix operator fun Pen.plus(otherPen:Pen):Pen{
    val s = "${this.inkColor} and ${otherPen.inkColor}"
    return Pen(s)
}

// using infix
infix operator fun Pen.minus(otherPen:Pen):Pen{
    val s = "${this.inkColor} or ${otherPen.inkColor}"
    return Pen(s)
}

fun main(){
    val blackPen = Pen("black")
    blackPen.showPen()

    val bluePen = Pen("blue")
    bluePen.showPen()

    // using operator
    val blueBlackPen = blackPen + bluePen
    blueBlackPen.showPen()

    // using infix
    val blueBlackPen1 = blackPen minus bluePen
    blueBlackPen1.showPen()
}