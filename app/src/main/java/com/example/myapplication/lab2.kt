@file:Suppress("UNREACHABLE_CODE")

package com.example.myapplication



fun sum(operand1: Int): Int {
    if (operand1 % 2 == 0) {
        return operand1

    } else {return operand1 * 2

    }
}

        fun main(){
           val number = 75

            val g=sum(number)
            print(g)
        }



