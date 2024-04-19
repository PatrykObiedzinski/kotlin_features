package advanced

import Person

fun reified() {
    reifiedFunction(Person())
}

inline fun <reified T> reifiedFunction(input: T) { // to perform operations on a type you have to reify the type and make function inline
    println("The class is: ${T::class.simpleName}")
}

//fun <T> notReifiedFunction(input: T): Unit {
//    println("The class is: ${T::class.simpleName}")
//}