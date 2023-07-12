fun main (){
    /*
  setof
  
  main propose of it is it doesnot take duplicated itmes
for example
    */
val nameCollection = setOf("Tapendra","Bista","Ram","Shree","Ram","Shree")

val numberCollection = setOf(1,2,3,4,5,6,1,2,3)

for (index in   nameCollection){
println(index)
}
println()
for (index in   numberCollection){
    println(index)
    }
   
}