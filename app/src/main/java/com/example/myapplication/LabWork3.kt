package com.example.myapplication

fun task1() {
    var nullableVariable: Int? = null
    println("Nullable variable: $nullableVariable")
    nullableVariable = 10
    val text: String = nullableVariable?.toString() ?: "Variable is null"
    println("Text: $text")
}