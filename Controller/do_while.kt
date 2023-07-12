fun main (){
// do while loop
// table
 var index =1
var number =5
 do {
println("${number} * ${index} = " + (number*index))
index++
 }while (index<=10)

 // factorial
 // 3628800
 do {
index*= number
    number--
     }while (number>0)
println("Factorial is " + (index))
    }