
 import kotlin.collections.hashMapOf
/*HashMap provides a flexible way to store key-value pairs and is easy to use.
HashMap provides efficient O(1) time complexity for basic operations such as adding, removing, and retrieving elements.
HashMap can be used to store a wide variety of data types, including user-defined objects. */






 fun main (){
    // hashMap 
var hashMap : HashMap<String, Int>
= HashMap<String, Int> () 
hashMap.put("Nepali",33 )

val hashMap2= hashMapOf("ktm" to 99 , "pkr" to 66)
hashMap.putAll(hashMap2)
print(hashMap)
}