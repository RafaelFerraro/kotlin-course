package basics

import java.lang.Exception

fun sumFun(firstNumber: Int, secondNumber: Int): Int{
    return firstNumber + secondNumber
}

fun throwsAnException() : Nothing {
    throw Exception("I told you")
}

fun sumAndPrint(firstNumber: Int, secondNumber: Int){
    val result = sumFun(firstNumber, secondNumber)
    println("The result of the sum is $result")
}