@file:Suppress("UNREACHABLE_CODE")

package com.example.myapplication

import kotlin.random.Random


//задание 1 вариант 2
//
// fun sum(operand1: Int)  : Int {
//    return if (operand1 % 2 == 0) {
//        operand1
//
//    } else {
//        operand1 * 2
//
//    }
//}
//fun main() {
//    val number = 75
//
//    val g = sum(number)
//    print(g)
//}
//
//
// задание 2 вариант 2
//val otvet: (Int) -> Boolean = { it % 2 == 0 }
//
//fun main(){
//    var k=9
//    var otv= otvet(k)
//    println(otv)
//}
//
// задание 3
fun prin(arr: List<Int>) {
    arr.forEach { println(it) }

     fun task1(x: Int): Int {
       return x * 2}
    val task2: (Int) -> Boolean = { x -> x % 2 == 0 }
        fun main() {
            print("Введите размерность массива: ")
            val size = readLine()!!.toInt()
            val mas = IntArray(size)
            for (i in mas.indices) {
                mas[i] = Random.nextInt(-100, 501)
            }
            prin(mas)

            val mas1 = mas.map(::task1)
            println("Массив после task1:")
            prin(mas1)
            println()


            val mas2 = mas.filter(task2)
            println("Массив после task2:")
            prin(mas2)
            println()

            val mas3 = mas.filter(task2).map(::task1)
            println("Массив после task2 и task1:")
            prin(mas3)


//задание 4


            val arrayTask3 = mas.filterAndMap(task2, ::task1)
            println("Array after applying task2 and then task1:")
            for (element in arrayTask3) {
                print("$element ")
            }
            println()
        }

    }  fun Array<Int>.filterAndMap(filter: (Int) -> Boolean, map: (Int) -> Int): Array<Int> {
    return this.filter(filter).map(map).toTypedArray()
}








