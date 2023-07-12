fun main (){
    /*
collection in kt 
here are 
list 
array 
map
set

// immutable collection
listOf
setOf
mapOf
    
    */ 
   val fruits = listOf("apple","banana","orange","grape")
for (i in fruits.indices){
    println(fruits[i])
}
// setOf as dart it filter and remove dublicte items let see
val mySet = setOf(1,2,3,2,3,0,0,"One","Two","three")
for (i in mySet){
    println(i)

}

// map
val myMap = mapOf(1 to "Tapendra",2 to "Bista")

for (i in myMap){
    println(i)

}
}