/*
Employee class.
web
android
iosdeveloper
*/
 open class Employee ( var name:String , var age:Int, var salary:Int){
  init{
    println("My name is $name, $age years old and earning $salary per month. ")  
}
}

class webDeveloper( name:String ,age:Int,salary:Int):Employee(name,age,salary){
fun display_web (){
    println("I am a webDeveloper.")
    println()

}
}

class androidDeveloper( name:String ,age:Int,salary:Int):Employee(name,age,salary){
    fun display_android (){
        println("I am an androidDeveloper.")
        println()
    }
    }

    class iosDeveloper( name:String ,age:Int,salary:Int):Employee(name,age,salary){
        fun display_ios (){
            println("I am an iosDeveloper.")
            println()
        }
        }

        fun main (){
val obj_web= webDeveloper("Abhishek Acharya",21,90000)
obj_web.display_web()
val obj_android = androidDeveloper("Tapendra Bista",21,80000)
obj_android.display_android()
val obj_ios = iosDeveloper("Ayush Dc",21,120000)
obj_ios.display_ios()
        }