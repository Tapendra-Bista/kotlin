 fun main (){
// break  use in loop and break@outer  statement 
var number = arrayOf(1,2,3,4,5)
for (i in number){
    if (number[i]==4){
        print("break " +number[i])
        break

    }
}

var input:Int = 1  
 if (input==1){
    println("1")
    println("2")
   
    println("3")
    println("4")
    println("5")
}
var num1 = 4
outer@ while (num1 > 0) {
    var num2 = 4
    inner@ while (num2 > 0) {
        if (num1==2)
            break@outer
        println("num1 = $num1, num2 = $num2")
        num2--
    }
    num1--
}



}