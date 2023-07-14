// range is a collection 

fun main (){
/*
There are three ways for creating Range in Kotlin –

Using (..) operator
Using rangeTo() function
Using downTo() function

*/

for (number in 1..100){
    print("\t"+number) // 1 to 100 using ..
}
print("\n")
for ( cha in 'a'..'e'){
    print("\t" +cha) // 1 to 100 using ..
}

print("\n")
for ( cha in 'v'.rangeTo('z')){
    print("\t" +cha) // 1 to 100 using ..
}
print("\n")
for (number in 100.rangeTo(1000)){
    print("\t"+number) // 1 to 100 using ..
}

print("\n")
for (number in 5.downTo(1)){
    print("\t"+number) // 1 to 100 using ..
}

print("\n")
for (number in 'e'.downTo('a')){
    print("\t"+number) // 1 to 100 using ..
}

print("\n")
for (number in 1..10 step 3){ // step make  gap in range
    print("\t"+number) // 1 to 100 using ..
}
print("\n")
(2..5).forEach(::println)

}