package regular

import Person

// more at https://kotlinlang.org/docs/scope-functions.html
fun scopeFunctions() {
    // let - mostly used to execute code when a value is not null(`?.let`)

    val str: String? = "Hello"
//    val str:String? = null
    str?.let {
        println("`$it` is not null!")
    }

    // apply - you can set field values to the newly created object

    val patryk = Person().apply {
        name = "Patryk"
        age = 28
    }
    println("apply: $patryk")

    // with - you can omit certain prefix e. g. `patryk`, it works as `apply` without returning an object
    with(patryk) {
        name = "ChangedPatryk"
        age = 29
    }
    println("with: $patryk")

    // run - works as `with`
    patryk.run {
        name = "ChangedPatrykOnceAgain"
        age = 30
    }
    println("run: $patryk")

    // run - without receiver(e.g. patryk)
    run {
        patryk.name = "PatrykKeepsBeingChanged"
        patryk.age = 31
    }
    println("run2: $patryk")

    // also - works as apply but you can use `it` to reference to the object
    val numbers = mutableListOf("one", "two", "three", "four")
    numbers.also { println("also: The list elements before adding new one: $it") }
        .add("five")
}