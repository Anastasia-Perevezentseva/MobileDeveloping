package com.example.myapplication

//import java.time.LocalDate
//import java.time.Month


//1 задача вариант 3

/*/import java.util.Calendar

fun main() {
    val c = Calendar.getInstance()

    val month = c.get(Calendar.MONTH)
    val day = c.get(Calendar.DAY_OF_WEEK)

    val dayt = ("Суббота")
    val mounss=( "Сентябрь")
    val names =("Анастасия")
    println("$day - $dayt")
    println("$month - $mounss")
    println(names)
}
 */

//2 задача вариант 18
/*/
fun main() {
    var date = LocalDate.parse("2018-12-31")
    val date2 = LocalDate.parse("2020-12-30")

    if (date > date2) {
        println("No")
    }
    else{
        println("Yes")
    }

    var year = date.year
    var monts = date.month
    var day = date.dayOfMonth

}
 задача 3 вариант №18
*/
/*/fun main() {
    var numberq = 638

    var des = numberq % 10
    var sot = numberq % 100 / 10
    var tis = numberq / 100
    print("$des,$sot,$tis")


    val numbers = arrayOf(des, sot, tis)
    var k = 0
    for (n in 0..2) {
        if (numbers[n]> 3 && numbers[n] < 8) {
            k++
        }

    }
    println()
    println(k)
} задание 4 вариант 6  */

fun  main(){
        val mas= arrayOf("g", "в","n","g")
    var k=0
    var j=3
    for(n in 0..1){

        println("${mas[n]},${mas[j]}")
        if (mas[n] == mas[j]) {
            k++

        }
        j=j-1


    }
    if(k==2)
        print("Является палиндромом")
    else{
        print("Не является палиндромом")
    }
    print(k)
}



