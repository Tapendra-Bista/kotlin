/*

This is type casting we use as as as? to cast or convert variable*/

fun main (){
var number : Any= 9
println(number)
var n2:String? = number as? String

println(n2)
val str1: Any? = null
val str2: String? = str1 as? String?      // throw exception
println(str1)
println(str2)
}