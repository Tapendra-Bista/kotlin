fun sumOf(a: Int, b: Int): Int {
    return (a + b)
}

fun main() {
    var x = 10
    var y = 20
    println("Sum of a+b is " + sumOf(x, y))
    if (sumOf(x, y) > 100){
        println(" greater than 100 yrrr")
    } else if (sumOf(x, y)==30){
        println("Equal yrrr") 
    }else{
        println("less yrrr")  
    }
}
