package advanced

fun label() {
    println("A regular break:")
    for (i in 1..4) {
        for (j in 1..4) {
            println("i= $i and j=$j")
            if (j == 2) break
        }
    }

    println("\nUsing a label:")
    loop@ for (i in 1..4) {
        for (j in 1..4) {
            println("i= $i and j=$j")
            if (j == 4) break@loop
        }
    }
}