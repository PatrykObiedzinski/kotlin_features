package basic

import Person

fun equals() {
    val patryk = Person().apply {
        name = "Patryk"
        age = 20
    }
    val patryk2 = Person().apply {
        name = "Patryk"
        age = 20
    }

    println(patryk == patryk2) // uses equals
    println(patryk === patryk2) // works as == in Java so it compares references(values of object references to be precise)
}