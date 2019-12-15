package basics

class Tuples {
    fun cityPopulation() : Pair<String, Long> {
        return Pair("Porto", 22000)
    }

    fun cityInformation() :Triple<String, String, Long> {
        return Triple("Madrid", "Europe", 399999)
    }

}

fun main() {
    var cityPopulation = Tuples().cityPopulation()
    var cityInformation = Tuples().cityInformation()

    println(cityPopulation.first)
    println(cityPopulation.second)

    println(cityInformation.first)
    println(cityInformation.second)
    println(cityInformation.third)

    // Using deconstruction
    var (name, continent, population) = Tuples().cityInformation()

    println("Name: $name, Continent: $continent and Population: $population")

    var list = listOf(Pair("Madrid", "Spain"), "Paris" to "France")

    for ((city, country) in list) {
        println("City => $city")
        println("Country => $country")
    }
}
