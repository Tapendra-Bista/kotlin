/*Kotlin properties can be declared either as mutable using the var keyword or as immutable using the val keyword. */
fun main() {

    /*var <propertyName>[: <PropertyType>] [= <property_initializer>]
    [<getter>]
    [<setter>] */

    // var number:Int =0
    // val constNumber:Int=9

    /*
     number is muttable and
     constNumber is immutable
     setter and getter only use in muttable variable


    */
    val d1 = demo()
    d1.name = "Komal" // access setter
    print(d1.name) // access getter

val m = maturity()
m.age=20

}

class demo {

    // it never be public because it defaultly public
    var name: String = "Tapendra"
        get() = field
        // gettter
        public set(value) { // setter

            field = value
        }
}


// custom  set
class maturity {
var age:Int = 0
get (){
    return field
}

public set (value){
    return if (value>18){
        return println("Your are 18+")
    }else {
         println("Your arenot 18+")
    }
}

}