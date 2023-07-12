           fun main (){
            // arrayList
     // it is use to create dynamic array
  // for eg
 // creating empty arraylist using constructor
var myNameList = ArrayList<String>()
   // adding elements
myNameList.add("Tapendra")
myNameList.add( "Ram")
myNameList.add("Komal")
  for (i in myNameList){
    println(i)
  }   
  var myNumberList = ArrayList<Int>()   
  myNumberList.add(1)
myNumberList.add(2)
myNumberList.add(3)
  for (i in myNumberList.indices){
    println(myNumberList[i])
  }     
myNameList.remove("Komal")
myNumberList.remove(3)
println("After removing items") 

for (i in myNameList){
    println(i)
  }   
for (i in myNumberList.indices){
    println(myNumberList[i])
  }   

  // nonEmpty arrayList 
 var Numberlist = arrayListOf(1,2,4,6,)
 for (i in Numberlist.indices){
    println(Numberlist[i])
  }  
           }