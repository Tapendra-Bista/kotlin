fun main() {
    // list of]]
    var number = listOf(1, 2, 3, 4, 5, 6)
    var names = listOf("T", "A", "P", "E", "N", 'D', "R", "A")

    for (index in 0 until number.size) {
        println(number[index])
    }
    println()
    for (index  in 0 until names.size) {
        println(names[index])

    }

    names.forEachIndexed({i, j -> println("names[$i] = $j")})

}
