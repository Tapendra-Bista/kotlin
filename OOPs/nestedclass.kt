fun main (){
    /*
    class outerClass {
       ............
      // outer class properties or member function
      
      class nestedClass { 
            ..........
            // inner class properties or member function
      }
}
nested class as nested loop 

inner class and outer class
innner class can access outer class data memeber and member fun
but not outer class access inner class data

*/
val d1 = demo1()
d1.name="Tapendra"
val d2 = d1.demo2()
d2.cast= " Bista"
d2.Display()
}


//  Nested class 

class demo1 {
var name:String=""
inner  class demo2 { // must be use inner keyword to make  nested class
var cast:String=""  
 fun Display (){
println("Full name is :" +name + cast)
 }
}
}