package basic

data class DataPerson(
    val name: String,
    val age: Int = 29 // default value
)

fun dataClass() { // similar to record in Java but also generates shallow copy and allows default values
    val person = DataPerson(
        name = "Patryk",
    )
    val copiedPerson = person.copy() // shallow copy
    val (copiedName, copiedAge) = copiedPerson // destructuring declaration

    println("Person: $person")
    println("Person: $copiedPerson")
    println("copiedName: $copiedName, copiedAge: $copiedAge")
}