/*An exception is an unwanted or unexpected
 event, which occurs during the execution of a 
 program i.e at run time, that disrupts the normal 
flow of the program’s instructions 
Syntax for try-catch block –
try {
   // code that can throw exception
} catch(e: ExceptionName) {
   // catch the exception and handle it
}
*/

fun main (){
division()
}

fun division (){
 print("Enter first number :")
    var number1= readLine()!!.toInt()

    print("Enter second number :")
    var number2= readLine()!!.toInt()

    try {
var div = number1/number2
            println("division is : "+ div.toFloat())       
     
    } catch (error:Exception){
println("Cannot divided by zero and must be intgers only!")
    } finally {
   if (number2!=0)println("Your Result!") else println("You got error !")

    }
}