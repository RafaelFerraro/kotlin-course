package basics.generics

import java.util.*

class EmployeeRepository(): Repository<Employee> {
    override fun create(entity: Employee): Employee {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findById(id: UUID): Employee {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findByName(name: String): List<Employee> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}