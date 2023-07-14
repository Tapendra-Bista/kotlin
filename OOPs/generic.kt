// generic templete as c++
 import java.math.BigInteger
class Company<T>(text: T) {
    var x = text
    init {
        println(x)
    }

  
}

// 

fun main() {

    Company<String>("Tapendra")
    Company<Int>(1)
    Company<Double>(9.9)
    calculator<Int>(3,3)

}

// calculator using  generic fun

fun <T>calculator(a:T,b:T){
    var x=a
    var y =b
when(x){

     is String -> println("Concatenation  is "+x+y)
     else ->{
        println("Number  are ${x} and ${y}") 
     }
}
}