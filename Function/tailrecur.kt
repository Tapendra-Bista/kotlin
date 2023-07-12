fun  mulR( a:Int,b:Int): Long {
    return if (b==0)

   return 0
       else    a+ mulR(a, b-1)
   
   }

fun main (){
    // tail  recursion  means use recursion fun at else position not at first simplicity
 // advantage of tail recursion
//  In tail recursion, we do not get the StackOverflowError during the execution of program.
// mul using tail recursion
var x:Int=5
var y:Int=4
println("Multiplication of ${x} and ${y} is : " +mulR(x,y))
}


