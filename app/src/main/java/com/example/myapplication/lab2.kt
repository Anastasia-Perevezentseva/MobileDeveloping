@file:Suppress("UNREACHABLE_CODE")

package com.example.myapplication



fun sum(operand1: Int)  : Int {
    return if (operand1 % 2 == 0) {
        operand1

    } else {
        operand1 * 2

    }
}

        fun main(){
           val number = 75

            val g=sum(number)
            print(g)
        }



