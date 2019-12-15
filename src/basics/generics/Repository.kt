package basics.generics

import java.util.*

interface Repository<T> {
    fun create(entity: T): T
    fun findById(id: UUID): T
    fun findByName(name: String): List<T>
}