package basics.generics

import java.util.*

class SupplierRepository: Repository<Supplier> {
    override fun create(entity: Supplier): Supplier {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findById(id: UUID): Supplier {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findByName(name: String): List<Supplier> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}