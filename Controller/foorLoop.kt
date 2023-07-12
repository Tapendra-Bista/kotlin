fun main (){
    /*
  In Kotlin, for loop is used to iterate 
  through the following 
  because all of them provides iterator.
Range
Array
String
Collection  
    */

    // range 
    for (i in 1..9){
        println(i)

    }

    // range with jump
    for (i in 1..9 step 4){
        println(i)

    }

    // downward rangbe not work here 
    for (i in 9..1){
        println(i)

    }

    // example of arrayof

    var numberList = arrayOf(1,2,3,4,5,6,7,8,9,10,11)
for (i in numberList){
    println(numberList[i])
}

// // collection
val collection = listOf(1,2,3,"one","two","three")

for (index in collection){
    println(index)
}
}