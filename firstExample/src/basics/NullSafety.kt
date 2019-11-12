fun main() {
    // Types cannot be null
    //val message: String = null

    val message: String = "A message"
    val nullMessage: String? = null
    val inferredNull = null

    println(message.length)
    //println(nullMessage.length) This causes an error

    println(nullMessage?.length)
    /*
    without ? operator, we would need to do something like that

    if (nullMessage != null) {
        println(nullMessage?.length)
    }
    */
}