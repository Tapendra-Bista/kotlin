import java.util.Scanner
// innerfunction part 
fun innerFunction (sign:String?,operation:Scanner,firstNumber:Int){
    when(sign){
        "/" -> {
           print("Enter second number:")
           var secondNumber = operation.nextInt()
           println("${firstNumber}  is divide by ${secondNumber} is :" + (firstNumber/secondNumber))
        }
       
        "*" -> {
           print("Enter second number:")
           var secondNumber = operation.nextInt()
           println("${firstNumber}  is multiple with ${secondNumber} is :" + (firstNumber*secondNumber))
        }
        "+" -> {
           print("Enter second number:")
           var secondNumber = operation.nextInt()
           println("${firstNumber} is addition with ${secondNumber} is :" + (firstNumber+secondNumber))
        }
        "-" -> {
           print("Enter second number:")
           var secondNumber = operation.nextInt()
           println(" ${secondNumber} is subtraction from ${firstNumber} is :" + (firstNumber-secondNumber))
        }
       
        else ->{
           print("Invalid option")
        }
           } 
}
fun main (){

    val operation = Scanner(System.`in`)
    print("Enter first number:")
    var firstNumber = operation.nextInt()
    print("Enter operator sign:")
    var sign = readLine()

// calling function
innerFunction(sign, operation, firstNumber) 

}

