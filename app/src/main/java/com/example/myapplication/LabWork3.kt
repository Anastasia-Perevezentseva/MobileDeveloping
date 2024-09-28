package com.example.myapplication

//задание 1
//fun main() {
//    var nullableVariable: Int? = null
//    println("нулевая: $nullableVariable")
//    nullableVariable = 10
//    val text: String = nullableVariable?.toString() ?: "Unknown"
//    println("$text")
//}
//задание 2
//
//fun GetFullName(firstName:String?, lastName:String?):String{
//    val firstNameString= firstName?.trim()?:"Unknown"
//    val lastNameString=lastName?.trim()?:"Unknown"
//    return "$firstNameString $lastNameString"
//}
//fun main(){
//    print("Введите имя:")
//    val name=readLine()
//    print("Введите фамилию:")
//    val lastName= readLine()
//    val allName= GetFullName(name,lastName)
//    println(allName)
//}
////задание 3
//
//
//fun calculateSquareRoot(number: Double?): Double{
//    return number!!.toDouble().let {
//        if (it < 0) {
//            throw RuntimeException("")
//        } else {
//            Math.sqrt(it)
//        }
//    }
//}
//fun main(){
//    println("Введите число:")
//    val number:Double = readLine()!!.toDouble()
//    val numberComplit= calculateSquareRoot(number)
//    print(numberComplit)
//}
//// задание 4
//
fun getStringLength(stringg:Any?):Int {
    return (stringg as? String)?.length ?: -1
}
fun main(){
    println("Введите строку:")
    val Stringg= readLine()
    val ASS= getStringLength(Stringg)
    println(ASS)
}
