package basics

import java.util.*

interface RepositoryInterface {
    val details : String
        get() = "Default implementation of details"

    fun generateId() : UUID
}

class DriverRepository : RepositoryInterface {
    override val details: String
        get() = "DriverRepository details"

    override fun generateId(): UUID {
        return UUID.randomUUID()
    }
}

class ProductRepository : RepositoryInterface {
    override val details: String
        get() = "ProductRepository details"

    override fun generateId(): UUID {
        return UUID.randomUUID()
    }
}

class Printer {
    fun printGeneratedId(instance: RepositoryInterface) {
        println(instance.generateId())
    }
}

interface Manager1 {
    fun handle() {
        println("Default implementation for Manager1 interface")
    }
}

interface Manager2 {
    fun handle() {
        println("Default implementation for Manager2 interface")
    }
}

// Overriding a function from a specific interface
class Candidate : Manager1, Manager2 {
    override fun handle() {
        super<Manager1>.handle()
    }
}

fun main() {
    Printer().printGeneratedId(DriverRepository())
    Printer().printGeneratedId(ProductRepository())
}