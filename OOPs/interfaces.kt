/*
an interface is a collection of abstract
 methods and properties that define a common contract
  for classes that implement the interface. 
  An interface is similar to an abstract class,
   but it can be implemented 
by multiple classes, and it cannot have state.


The interface definition in Kotlin begins 
with the interface keyword followed by the name
 of the interface, followed by the curly braces within 
which the members of the interface reside.


interface Vehicle()
{
  fun start()
  fun stop()
}

interface is a method to override let see
*/


interface  parent1 {
 fun start () {
    println(" Start a car parent")
 }
 fun end () {
    println("End a car parent")
 }

}

class child1:parent1 {
 override  fun start () {
        println("Start a car child")
     }
 override    fun end () {
        println("End a car child")
     }


}

fun main (){
val obj = child1()

obj.start()
obj.end()
val obj2 = result()
obj2.area()
obj2.perimeter()
}


// inhertance interface

interface dimension {
    public
var length:Double
var width:Double

}

 public interface calculate :dimension {
    public
 fun area()
 fun  perimeter ()

}

class result :calculate {
override    var length:Double= 20.20
 override   var width:Double =20.20
 override fun area(

 ){
    println("area  is " +(length*width).toFloat())
 }
 override fun  perimeter (){
    println("perimeter  is " +(length+width).toFloat())
 }
}