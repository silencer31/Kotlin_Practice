package org.example

fun main() {

    arrayExamples()

    listExamples()

    setExamples()

    mapExamples()

    operationExamples()

    // Вызов функций с аргументами функционального типа из func_functions.kt
    val firstVal = calculateSavings(3000, 0.12, 8,
        printInfo = {salary, rate, period, bank ->
            println("salary: $salary, rate: $rate, period: $period, bank: $bank") } // Тут тело после ->
    )


    val secondVal = calculateSavings(3000, 0.12, 8,
        printInfo = {_, _, _, bank -> println(bank) } // Если не все аргументы используются, можно так
    )

    // Если лямбда выражение, это последний аргумент функции, то можно вынести эту лямбду за скобки
    val thirdVal = calculateSavings(3000, 0.12, 8) {_, _, _, bank -> println(bank) }

    // 4тый параметр не передаем
    val fourthVal = calculateSavingsNull(3000, 0.12, 8)


}