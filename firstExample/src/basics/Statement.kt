package basics

fun main() {
    var text = "Text here"

    var result = if (text is String) {
        "$text is a String"
    } else {
       "$text is not a String"
    }

    var value = 2;
    when(value) {
        1 -> println("Value is 1")
        2 -> println("Value is 2")
        else -> {
            println("Value is neither 1 nor 2")
        }
    }

    var newValue = 10
    when(newValue) {
        in listOf(1, 2, 5) -> println("newValue is or 1 or 2 or 5...")
        !in 20..30 -> println("newValue is outside of the range between 20 and 30")
        in 1..20 -> println("newValue is in between 1 and 20")

    }
}