import java.util.Scanner

fun main (){
    val inputNumber = Scanner(System.`in`)
 var number = arrayOf(1,2,3,4,5)
for ( i in number){
print(" ${i}\t")
}

print(" \n Choose any number :")
var chooseNumber = inputNumber.nextInt()
if (chooseNumber==1){

    print("Your are Cute 😚")
}else
if (chooseNumber==2){

    print("Nice to meet you 😁")
} else
if (chooseNumber==3){

    print(" What is your birthday date ?")
} else
if (chooseNumber==4){

    print("Where you wiil be tommorow 😉")
} else
if (chooseNumber==5){

    print("Your are 10/10 percentage handsome ")
}
}

