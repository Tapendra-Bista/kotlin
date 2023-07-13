//  extension kt
// simiplicity access class data or fun in main fun 
// easy ways
import kotlin.math.PI
import java.util.Scanner

class Circle (var Radius:Double){
 fun  Area ():Double{
    return Math.PI.times(Radius).times(Radius)
 }
}
fun main (){
    fun  Circle.Perimeter ():Double{ // way of use extension
        return 2* Math.PI.times(Radius)
    }
var circle = Circle(10.0)
println("Area of circle is : "+circle.Area().toFloat()
)
println("Perimeter of circle is : "+circle.Perimeter().toFloat())

fun displayx.putdata (){
println("The name  is : " +name)

}
print("Enter your name :")
var inputname:String= readLine()!!.toString()
displayx(inputname).putdata()
}


class displayx{
    var name:String = ""
constructor(name:String)
 {
this.name=name

 }

 
}