fun main (){ 
    //declaring a hash set of integers
    val seta = hashSetOf(1,2,3,3);
    //printing first set
    println(seta)
      
    //declaring a hash set of strings
    val setb = hashSetOf("Geeks","for","geeks");
    println(setb);

    val newData = hashSetOf(4,5,6,7,8,9)
    seta.addAll(newData)
    seta.add(10)
    println(seta)
    println(" element at 9 " + seta.elementAt(9))
}