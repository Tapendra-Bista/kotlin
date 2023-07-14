// regex main use to search any result or matching something

// Note regx of kt  is similar as js

// 
 fun replaceLetter (){
    val word = Regex("a")
    val letterE = Regex("e")
  println(letterE.replaceFirst("eeee", "T"))  
  println(letterE.replace("eeee", "T"))  
  println(word.replace("tapendra", "@"))
 }
fun main (){
    replaceLetter ()
    // matchTest()
// findLetter ()

}


fun matchTest (){
// test letter contain a and z or not
// Compare also small and capital letter to
    val pattern = Regex("^a")
val patternz = Regex("^Z")
println(pattern.containsMatchIn("abc")) // true
println(pattern.containsMatchIn("bac")) // false
println(pattern.containsMatchIn("apple ")) // true
println(patternz.containsMatchIn("Zebra")) // true
println(patternz.containsMatchIn("zebra")) // false
   
}


fun findLetter (){
        // Regex to match "ll" in a string
        val pattern1 = Regex("ll")
        val ansx : MatchResult? = pattern1.find("HelloHello", 5)
        println(ansx ?.value)
// found letter in word
val letterA = Regex("a")
val ans : MatchResult? = letterA.find("apple",0)
val ans1 : Sequence<MatchResult> = letterA.findAll("apapalekomaa",0)
println(ans?.value?.length)
println(ans?.value)
ans1.forEach() {  // ans1 become list at this time
    matchResult  -> println(matchResult.value)

 }
 var sum =1
for (index in ans1){

     sum += index.value.length
}
println(sum)
}