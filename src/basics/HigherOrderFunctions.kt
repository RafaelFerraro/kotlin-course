package basics

import kotlin.reflect.KFunction1

fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun sum(x: Int, y: Int) : Int {
    return x + y
}

fun printNameOperation(name: String, op: (String) -> Unit) {
    return op(name)
}

fun printName(name: String) {
    println(name)
}

fun main() {
    println(operation(5, 5, ::sum))
    printNameOperation("Rafael", ::printName)
}

