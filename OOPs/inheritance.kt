/* inheritance access of one class data two another class
parent class, base class give data to child subclass as welll as derived 
class 

we cannot access data of derived class to main class or parent class 

:Note : we use open keyword to make derived class of parent class at parent class
// demo

*/
open  class parent  { // open keyword to make parent class
public
var name:String = "Tapendra"

}

class child: parent(){
   fun display (){
    println(name)

   } 
}
fun main (){
    val derived = child()
    derived.display()
/*
Syntax of inheritance:

open class baseClass (x:Int ) {
      ..........
}
class derivedClass(x:Int) : baseClass(x) {
     ...........
}


*/
val nameO = display("kaka")
nameO.a()

}

 open class name {
   var name:String =""
   constructor(value:String){
name=value
   }  
}

class display(value:String):name(value){
fun a (){
    println(name)

}
}