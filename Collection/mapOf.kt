fun main (){

    /* map collection store pair of data  */
    val myMap = mapOf("Name" to "Tapendra")
    println(myMap)

    val mynumber = mapOf( 1 to  2)
    println(mynumber)

    // init with empty
  
    val mapCollection=mapOf<String ,Int>()
    mapCollection.plus(" Name" to 99)






      // with empty "HashMap of <String, Int>"
      var hashMap : HashMap<String, Int>
      = HashMap<String, Int> ()



//adding elements to the hashMap using
// put() function
hashMap.put("IronMan" , 3000)
hashMap.put("Thor" , 100)
hashMap.put("SpiderMan" , 1100)
hashMap.put("NickFury" , 1200)
hashMap.put("HawkEye" , 1300)

//printing the non-Empty hashMap
print(hashMap)
print(mapCollection)
}