package basic

fun sequence() {
    val names = listOf("Patryk", "Rafał", "Tomasz")
    println("Sequence:")
    names.asSequence() // works as Java Stream by being lazily evaluated
        .filter {
            println("Filtering $it")
            it.contains("t", true)
        }
        .map {
            println("Mapping $it")
            it.uppercase()
        }
//        .toList()

    println("\nWithout sequence:")
    names // iterates all values at once
        .filter {
            println("Filtering $it")
            it.contains("t", true)
        }
        .map {
            println("Mapping $it")
            it.uppercase()
        }
}