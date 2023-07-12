// secondary 

class secondary {
var number1:Int =0
var number2:Int =0
var number3:Int =0 
constructor(  a:Int,  b:Int ,  c:Int){ // parameterized  Constructor

number1=a
number2=b
number3=c
println("Number are " +number1 +number2 + number3)
println("Addition are " +(number1 +number2 + number3))
}

}

class sample {
var sample:Int=9
constructor(){ // default constructor
    sample=0
println("Sample number is " +sample)
}
}
fun main (){
sample()
secondary(1, 2, 3)
    /*
there are  two type of Constructor
primary
secondary
    */

// Note : we use constructor key for constructor not class name like c++
val primary = primary("Tapendra")
primary.display()

val primary2 = primary2(30, 10)
primary2.display()
}

// primary class

class primary ( var name:String="") // () This is use to make primary constructor we can make class without this
{

 fun display (){
        return println("Name is "+ name)
    }
}

class primary2 ( var a:Int , var b:Int ) // () This is use to make primary constructor we can make class without this
{
    fun display (){
     println("additon is "+ (a+b))
     println("subtraction is "+ (a-b))
     println("Multiplication is "+ (a*b))
     println("divide  is "+ (a/b))
    }  
}