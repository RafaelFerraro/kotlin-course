package basics

import java.util.*

open class Product(open var name : String) {
    open fun printProductName() {
        println("Product name: $name")
    }

    final fun getId() : UUID {
        return UUID.randomUUID();
    }
}

class Book(override var name: String) : Product(name) {
    override fun printProductName() {
        println("Book name: $name")
    }
}

data class Shoes(override var name: String) : Product(name) {
    override fun printProductName() {
        println("Shoes name: $name")
    }
}

// Using inheritance with secondary constructor
open class Vehicle {
    var name : String
    open var type : String = ""

    constructor(name: String) {
       this.name = name
    }

    fun printVehicle() {
        println("$name, $type")
    }
}

class Car : Vehicle {
    constructor(name: String) : super(name) {
        type = "Car"
    }
}

// Using inheritance with abstract classes
abstract class Base {
    abstract fun id() : UUID
}

class BaseChild() : Base() {
    override fun id() : UUID {
        return UUID.randomUUID()
    }
}

fun main() {
    var book = Book("Kotlin")
    var shoes = Shoes("Nike shoes")

    book.printProductName()
    println(book.getId())
    shoes.printProductName()

    var car = Car("Ferrari")
    car.printVehicle()

    var baseChild = BaseChild()
    println("BaseChild instance ID: ${baseChild.id()}")
}

