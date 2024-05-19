package regular

fun extensions() {
    val myString = "ABCDEF"

    myString.myExtension()
}

private fun String.myExtension() {
    println("My extension string is: $this")
}