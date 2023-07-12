fun main (){
  // string 
  val name:String = "tapendra" 

for (i in name.indices)
println(name[i])

// nameList
  var nameList:Array<String> = arrayOf <String>("T","A","P","E","N","D","R","A")
nameList.forEach ({i ->println(i) })
}