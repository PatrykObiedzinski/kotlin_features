package advanced

private val lazyValue: String by lazy {
    println("computed once!")
    "Hello World"
}

private fun getValue(): String {
    println("it should be computed many times!")
    return "Hello"
}

fun delegation() {
    println("Without lazy:")
    repeat(3) { println(getValue()) }

    println("\nWith lazy:")
    repeat(3) { println(lazyValue) }
}

