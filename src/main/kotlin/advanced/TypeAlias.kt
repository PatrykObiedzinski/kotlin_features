package advanced

typealias MyAlias = () -> Unit
typealias PredicateAlias<T> = (T) -> Boolean

fun typeAlias() {
    withMyAlias {}

    val predicateAlias: PredicateAlias<Int> = { it > 5 }
    withPredicateAlias(predicateAlias)
}

private fun withMyAlias(alias: MyAlias) {
    println("Alias `$alias` has been used")
}

private fun <T> withPredicateAlias(alias: PredicateAlias<T>) {
    println("Alias `$alias` has been used")
}