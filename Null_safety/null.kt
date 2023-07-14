/*
Null 
null safety refers avoid varible or data from brcome null
most be initilazid  data varible to avoid error 
null pointer exception

it is used because  it make app or software crash well null occur

null safety be implement 
by using 
!! operator or ?.
or by initilaizing
*/

fun main (){
    nullchek ()
try {

    var name:String = "Tapendra"
//    name = null  compiler error
println(name+"Length " +name.length)

} catch (e:Exception){
    println(" Errro occour at ")
    println(e)
} finally {
    println("Result")
}

}


fun nullchek (){
   var  s:String? = "Tapendra" 
   println(s)
// know s can be null at any point

if(s!=null){
println(s)

}else{
println("nulll ")

}

s=null


if(s!=null){

    println(s)

    
    }else{
    println("nulll ")
    
    }
}