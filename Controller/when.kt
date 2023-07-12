import java.util.Scanner

fun main (){

// int 
println(" enter integer :")
var input = readLine()!!.toInt()

when(input){
    1-> println(" one number")
    2-> println(" two number")
    3-> println(" two number")
    else ->println("Invalid option")
}

// string
println("Enter your name :")
var inputName = readLine()!!.toString()
when(inputName){
"tapendra" ->println("Be unique")
"deadlock" ->println("is it your nickname")
else -> println(" No name")

}

// double 
// stringprintln("Enter your name :")
println("Enter double :")
var inputdouble = readLine()!!.toDouble()
when(inputdouble){
9.9 ->println("9.9")
3.3 ->println("3.3")
else -> println("Waps ! Error")


}

// simple game 
// val inputany = Scanner(System.`in`)

var inputCheck: Any = 9.9
when(inputCheck){
 is Int -> println("It is integers ")
 is Double -> println(" It is doube")
 is String -> println(" It is string")
 
}

}