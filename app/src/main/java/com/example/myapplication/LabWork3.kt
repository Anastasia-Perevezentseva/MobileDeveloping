package com.example.myapplication

//задание 1
fun task1() {
    var nullableVariable: Int? = null
    println("Nullable variable: $nullableVariable")
    nullableVariable = 10
    val text: String = nullableVariable?.toString() ?: "Variable is null"
    println("Text: $text")
}
//задание 2

fun GetFullName(firstName:String?, lastName:String?):String{
    val firstNameString= firstName?.trim()?:"dddd"
    val lastNameString=lastName?.trim()?:"sss"
    return "$firstNameString,$lastNameString"
}
fun task2(){
    println("Введите имя:")
    val name=readLine()
    println("Введите фамилию:")
    val lastName= readLine()
    val allName= GetFullName(name,lastName)
}
//задание 3

