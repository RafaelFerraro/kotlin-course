package basics.generics

import java.util.*

fun main() {
    var employee = Employee(id = UUID.randomUUID(), name = "Rafa")
    println(employee.id)
    var createdEmployee = EmployeeRepository().create(employee)

    var supplier = Supplier(id = UUID.randomUUID(), name = "Ana")
    var createdSupplier = SupplierRepository().create(supplier)
}