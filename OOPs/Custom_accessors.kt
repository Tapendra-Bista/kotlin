fun main (){
    // class also take parameter 
val s= square(100, 100)
println("is Square " +s.isSquare)

val n = Number()
val n1 = Numberx()
n.age=99
n1.age=100
print(" age :" + n.age)
print(" age :" + n1.age)
}

// checking square or not 

class square ( var length:Int, var width:Int){ // primary constructor
var isSquare:Boolean=false 
get (){
    return  length == width
}

}

class Number (
var age:Int =0
)

class Numberx {
var age:Int =0
}