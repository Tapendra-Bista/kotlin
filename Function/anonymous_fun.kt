val myArray = arrayOf(1,2,3,4,5,6,7,8,9,10)
fun main (){
    // A fuction without name is 
    //called anonymous function
// lambda expression are anonymous fun

// syntax of lambda expression

// val lambda_name : Data_type = { argument_List -> code_body }
val name = {println("Tapendra bista")}
// invoking function method1
name()
// invoking function method2
name.invoke()
println("Sum is : " +sum(2,3))
println("Sum is : " +sum1(2,3))
println("Mul is : " +mul(2,3))
println("Mul1 is : " +mul(9,3))
fullName.invoke(" Ram ","Komal")
myArray.plus(11)
println("Greater than 8 is " +myArray.filter { it >8 }.toString())

}

// lambda xepression
// with type annotation in lambda expression
val sum ={a:Int ,b:Int -> a+b}
// withOut type annotation in lambda expression
val sum1:(Int,Int)->Int = {a ,b -> a+b}
// full name 
val fullName = {name:String,cast:String -> println("fullName is :" +name +cast)}
// anonymous function   with body as a block
val mul = fun(a:Int,b:Int):Int{
    return a.times(b)
}

// anonymous function   withOut body as a block
val mul1 = fun(a:Int,b:Int):Int= a.times(b)
