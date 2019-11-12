package basics

fun main() {
    for (i:Int in 1..100) {
        println(i)
    }

    println("--------------------------")

    var items = listOf<Int>(1, 2, 3)
    for (item in items) {
        println(item)
    }

    println("--------------------------")

    for (number in 10 downTo 1) {
        println(number)
    }

    println("--------------------------")

    for (number in 1..10 step 2) {
        println(number)
    }

    println("--------------------------")

    var magicNumber:Int = 10
    while (magicNumber >= 1) {

        if (magicNumber == 1) {
            println("Hi number $magicNumber")
        } else {
            println("Number $magicNumber is bigger than 1")
        }

        magicNumber--
    }
}