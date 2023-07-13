
/*
enum is a class  which use to declare short data 
just like dart
Note: to keep data we donot need to declare data type
*/

// example 
enum class Myname{
tapendra,
bista
}

fun main (){
println(Numberxx.one)


for ( index in   Myname.values()){
    println(index)
}
when(DAYS.SUNDAY){
     DAYS.SUNDAY -> println("Today is sunday")
 DAYS.MONDAY-> println("Today is monday")
     DAYS.TUESDAY -> println("Today is tuesday")
     DAYS.WEDNESDAY-> println("Today is wednesday")
     DAYS.THURSDAY-> println("Today is thursday")
     DAYS.FRIDAY -> println("Today is friday")
     DAYS.SATURDAY-> println("Today is saturday")
}
Seasons.Summer.foo()
}

enum class DAYS{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}
// 
enum class Seasons(var weather: String) {
    Summer("hot"){
        // compile time error if not override the function foo()
        override fun foo() {              
            println("Hot days of a year")
        }
    },
    Winter("cold"){
        override fun foo() {
            println("Cold days of a year")
        }
    },
    Rainy("moderate"){
        override fun foo() {
            println("Rainy days of a year")
        }
    };
    abstract fun foo()
}

// 

enum class Numberxx{
one,
two,
three,
four,
five,
}