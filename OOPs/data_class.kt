fun main (){
    /*
    data class declare inside main fun
    it most has at least on paramter 
   
    fun of data class are 
equals()
hashCode()
toString()
copy()

    */
    // Note: data class  is create to hold data only  their is no  member function 

// example:

data class student(var name:String,var rollno:Int, var college:String, var semester :String)

var student1= student("Tapendra Bista",33,"Amrit Sciecnce Campus"," 3rd semester")
println(student1.toString())

data class initdata (var data:Int,var data1:Double)
var database = initdata(9,0.0)
var database1 =database.copy(10,9.9)
println(database.data1)
println(database1)
}

