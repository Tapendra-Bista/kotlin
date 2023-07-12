import java.util.Scanner

fun main (){
val input = Scanner(System.`in`)
var mybool:Boolean?

// example of else if statement
print("Enter number :")
var number = input.nextInt()
if (number==1){
    mybool=true
    println(" 1 no printed")
if (mybool==true){
    print(" 1 no printed with true value ") 
} else {
    print(" 1 no printed with false value")
}

} else if (number==2){
    print(" 2 no printed") 
}else {
    print("Input range is 1..2")  
}

}