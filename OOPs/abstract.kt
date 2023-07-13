/*
we make abstract class and  fun using  abstract keyword

must be inheritance that call and override that

example calculator
Note : it doesnot have object
*/

 abstract  class calculator {
  abstract  fun option ( a:Int, b:Int):Unit 
 }

 class add : calculator (){

override  fun option ( a:Int, b:Int):Unit {
    return println("Addtion is  " + (a+b))
    }
 }

 class sub : calculator (){
 override    fun option (a:Int,b:Int):Unit{
return println("Subtraction is  " + (a-b))
     }
 }

 class mul : calculator (){
    override    fun option (a:Int,b:Int):Unit{
   return println("Multiplication is  " + (a*b))

        }
    }

    class div : calculator (){
        override    fun option (a:Int,b:Int):Unit{
       return println("Division is  " + (a/b))
            }
        }

        fun main (){
      add().option(10, 10)
      sub().option(100, 90)
      mul().option(9, 9)
      div().option(10, 10)
     information().Getname()
     information().Displayname()
      
        }

        // abstract
abstract    class demox {
    abstract var name:String


abstract fun  Getname ()
abstract fun Displayname ()
        }

 class information:demox(){
 override  var name:String= readLine()!!.toString()
 override fun Getname(){
    print("Enter your name :")
 }
override fun Displayname (){
    print("Your name is :" + name)
 }

}