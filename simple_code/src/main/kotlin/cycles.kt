package org.example

fun cycle_examples() {


    for (i in 1..2030) {
        println(i)
    }

    // Вниз
    for (i in 2030 downTo 1) {
        println(i)
    }

    // С указанием шага
    for (i in 0..40 step 10) {
        println(i)
    }

    var number: Int = -1
    while (number < 1) {
        println("Введите натуральное число:")
        number = readLine()!!.toInt()
    }

    do {
        println("Введите натуральное число:")
        number = readLine()!!.toInt()
    } while (number < 1)


}