fun sum(a: Int, b: Int): Any {
    return println(" add is " + (a + b))
}

fun sub(a: Int, b: Int): Any {
    return println(" sub is " + (a - b))
}

fun mul(a: Int, b: Int): Any {
    return println(" mul is " + (a * b))
}

fun div(a: Int, b: Int): Any {
    return println(" div is " + (a / b))
}

fun main() {
    // // add sub mul and div using function
    // val a: Int = 99
    // val b: Int = 99
    // sum(a, b)
    // sub(a, b)
    // mul(a, b)
    // div(a, b)

    // /* syntax
    // fun fun_name(a: data_type, b: data_type, ......): return_type  {
    //     // other codes
    //     return
    // }
    // */
    // // inbuild function
    // val number = arrayOf<Int>(1, 2, 3, 4, 5, 6)
    // var numberSum = number.sum()
    // print(numberSum)
    studentDetails("Tapendra", 88, 12, "Amrit science college")
    studentDetails("Ram", 77, 12, "Amrit science college")
    studentDetails("Hari", 66, 12, "Amrit science college")
    studentDetails("Laxma", 55, 12, "Amrit science college")
    studentDetails("Raju", 44, 12, "Amrit science college")
    studentDetails("Abhishek", 33, 12, "Amrit science college")
}

fun studentDetails(name: String, rollNo: Int, myClass: Int, college: String): Any {
    return print(
            "\nName is :" +
                    name +
                    "\nrollno is :" +
                    rollNo +
                    "\nclass is :" +
                    myClass +
                    "\ncollege is :" +
                    college
    )
}
