 private class sample3 {

    val name:String = "Tapendra"

fun display (){
    println(name)
}

}



fun main (){
//  val w =   sample3()
//  w.display()
sample3().display()
/*
public:{
    visible everyWhere

}

private:{
    Visible inside the same class only
}

internal:{
    visible inside the same only
}

protected:{
    visible inside the same class and subclass 
    subclass means heritance  classs or child class
}
*/

/// we use visibility keyword at first than class not inside as c++
val n = demo123()
// n.number=10  cannot accesss

n.display()
val n1 = demo1234()
n1.number1=10
n1.display()
val n2 = demo12345()
// n2.number2=0  cannot accesss
n2.display()

n2.display()
}


 class demo123 {
private
  var number :Int = 9
fun display (){
    print(number)


}


}
class demo1234 {
    public
      var number1:Int = 9
    fun display (){
        print(number1)
    
    
    }
    
    
    }

  class demo12345 {
        protected
          var number2 :Int = 9
        fun display (){
            print(number2)
        
        
        }
        
        
        }