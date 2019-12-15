package basics

class Data(var items: List<String>)

fun main() {
    val listOfData = listOf(
        Data(listOf("A", "B")),
        Data(listOf("1", "2"))
    )

    val combined = listOfData.flatMap { it.items }
    println(combined)

    val combinedMap = listOfData.map { it.items }
    println(combinedMap)
}
