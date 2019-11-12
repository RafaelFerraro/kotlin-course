package basics

class Customer(var id: Int, var name: String)

data class CustomerData(var id: Int, var name: String)

fun main() {
    var customer1 = Customer(1, "Rafael")
    var customer2 = Customer(1, name = "Rafael")
    println(customer1)
    println(customer2)

    if (customer1 == customer2) { // here we compare the object id
        println("Customers: They are the same")
    }

    var customerData1 = CustomerData(1, "Rafael")
    var customerData2 = CustomerData(1, "Rafael")
    println(customerData1)
    println(customerData2)

    if (customerData1 == customerData2) {// here we compare the data literally
        println("CustomersData: They are the same")
    }

    // Using the copy() method
    var customerData3 = customerData1.copy()
    var customerData4 = customerData1.copy(id = 2)
    println(customerData3)
    println(customerData4)
}
