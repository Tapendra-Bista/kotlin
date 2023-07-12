fun defaultAgu(a: Int = 1, b: Int = 1, c: Int = 1): Any {

    return (a + b + c)
}

// with string
 fun nameList (name:String= "Tapendra",cast:String="Bista"):Unit{
return println(" Fullname is  ${name} ${cast}.")
 }
fun main() {

    // function with default argument
    println("Sum is : " + defaultAgu(3)) // with 1 agru
    println("Sum is : " + defaultAgu(3,9)) // with 2 agru
    println("Sum is : " + defaultAgu(3,3,3)) // with 3 agru
    println("Sum is : " + defaultAgu())
    nameList("Ram")
    nameList("Hari","Kale")
    nameList()
}