

import Fruit// sealed class only in kotlin
// it is like a nested class
sealed class parent2 {
class A:parent2(){
    fun display(){
        println("hello this is a subclass A of parent2")
    }
}

class B:parent2(){
    fun display(){
        println("hello this is a subclass B of parent2")
    }
}

}


// IT CAN DEFINE INSIDE  SEALED

fun main (){
    val w = parent2.A()
    val z = parent2.B()
    w.display()
    z.display()
val v1 = Fruit.Apple()
val v2 = Fruit.Orange()
val v3 = Mango()
display(v1)
display(v2)
display(v3)
}


// advance   example
sealed class Fruit( val name:String) {
class Apple:Fruit("Apple")
class Orange:Fruit("Orange")
}

class Mango:Fruit("Mango")

fun display(Fruit:Fruit){
    when (Fruit){
 is  Fruit.Apple -> println("This is a apple ")
 is  Fruit.Orange -> println("This is a orange ")
 is  Mango -> println("This is a mango")
    }
}

