fun main() {
    // mutableset  means unconst or changeable
    var number =mutableSetOf(1, 2, 3, 4, 5, 6)
    var names = mutableSetOf("T", "A", "P", "E", "N", 'D', "R", "A",)

    for (index in  number) {
        println(index)
    }
    println()
    for (index  in  names) {
        println(index)

    }

number.add(7)
number.add(8)
number.add(9)
number.add(10)
names.add("k")
names.add("l")
names.add("O")
names.add("H")
println("After added new items")
for (index in  number) {
    println(index)
}
println()
for (index  in  names) {
    println(index)

}
number.remove(10)
number.remove(9)
names.remove("O")
names.remove("H")
println("After removed  items")
for (index in  number) {
    println(index)
}
println()
for (index  in  names) {
    println(index)

}
}
