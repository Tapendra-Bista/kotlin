fun factorial(number: Int = 1): Long {
    return if (number == 1) return 1 else number * factorial(number - 1)
}

fun main() {
    // recursion fun in kt
    var x: Int = 5
    var y: Int = 10
    println(" factorial of " + x + " is " + factorial(x))
    println(" factorial of " + y + " is " + factorial(y))
    display(5)
}



fun display(number: Int = 1) {
    println("Tapendra")
    if (number > 1) display(number - 1)
}
