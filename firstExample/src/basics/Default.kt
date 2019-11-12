package basics

fun main() {
   println("Hello World")

   sumFun(10, 20)
   sumAndPrint(50, 50)

   functionWithDefaultArgumentValues("Pen", useful = true, details = "Very good")
   printStrings("Rafael", "João", "Maria")
}

fun printStrings(vararg strings: String) {
   for (string in strings) { println(string) }
}

fun functionWithDefaultArgumentValues(name: String, details: String = "", useful: Boolean) {
   println(
      """
          Type: $name
          It is useful? ${formatBoolean(useful)}
          Details are optional, but they are good: $details
      """
   )
}

fun formatBoolean(value: Boolean): String {
   val formattedValue = when (value) {
      true -> "Yes"
      else -> "No"
   }

   return formattedValue
}