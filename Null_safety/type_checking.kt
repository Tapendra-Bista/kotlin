/*
Type checking refers to checking  varible type i.e
string
double
float 
int 
in program 

// it can be done by using   is keyword
*/

// example
// is! use

fun sample2 (input:Any ){
 if (input !is String){
println("This is not a string  code block !")
 }
}




fun main (){
    sample2(9.9)
    // simple example
var type: Any =9.9
 if (type is String){
    println("String Block !")
    println("Value of type is " +type)
 } else if (type is Int){
    println("Int Block !")
    println(" Value of type is " +type)
 } else if (type is Double){
    println("Double Block !")
    println(" Value of type is " +type)
 }
 typeChecking () 
}

fun typeChecking ()
{

var name:String ="Tapendra"
var age:Int=21
var salary :Double= 90000.23

  var Employeee =arrayOf(name,age,salary)

for (person in Employeee){
    if (person is String){ // type checking
println("String Block !")
println("Name is " +person)
    }else if (person is Int){ // type checking
        println("Int Block !")
        println("Age is " +person)
    }else if (person is Double){ // type checking
        println("Double Block !")
        println("Salary is " +person)
    }
}
}