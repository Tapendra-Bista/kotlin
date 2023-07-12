fun main (){
// To make array in kt we use libary arrayOf
// let's see
val number = arrayOf< Int>(1,2,3,4,5,6)
val number1 = intArrayOf(7,8,9,10)
val number2 = arrayOf(11,12,13,14,15,15)

for (i in number){
    print(" ${i} ")
}
for (i in number1){
    print(" ${i} ")
}
number2.set(5, 16)
number2.plus(17)
number2.plusElement(17)
for (i in number2){
    print(" ${i} ")
}
// number2.forEach ({ index -> println(index) })

}