fun main (){
    /*
  A class is a blueprint for creating objects (a particular data structure), providing initial values for state (member variables or fields), and implementations of behavior (member functions or methods).

An object is an instance of a class and has its own state and behavior. You can create multiple objects from the same class, each with its own unique state.  
    
    */
// main focus in class and object
var d1 = Demo() // objects
var d2 = Demo()
var d3 = Demo()
d1.name="Tapendra"
d1.age=11
d1.money=33.33
d2.name="Ram"
d2.age=22
d2.money=66.66
d3.name="Shree"
d3.age=33
d3.money=77.77
d1.Display()
d2.Display()
d3.Display()
var t = Demo1()
var A = Demo1()
var p = Demo1()
var e = Demo1()
var n = Demo1()
var d = Demo1()
var r = Demo1()
var a = Demo1()
t.letter='T'
A.letter='A'
p.letter='P'
e.letter='E'
n.letter='N'
d.letter='D'
r.letter='R'
a.letter='A'
t.Display()
A.Display()
p.Display()
e.Display()
n.Display()
d.Display()
r.Display()
a.Display()
}


class Demo { // Demo class name
    // here public defaultly  
var name:String=""
var age:Int=0
var money :Double=0.0

fun Display (){
println("Name:${name},Age:${age},Money:${money}")
}
}

class Demo1 {
var letter:Char='t'
fun Display (){
    print(letter)
    }


}