package basics

class Database {
    fun commit() = Unit
}

fun transaction(database: Database, query: () -> Unit) {
    try {
        query()
    } finally {
        database.commit()
    }
}

fun querySelectPeople() {
    println("Select * from people")
}

fun main() {
    var database = Database()

    transaction(database) {
        println("Select * from people")
    }

    transaction(database, ::querySelectPeople)
}