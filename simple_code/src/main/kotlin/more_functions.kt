package org.example

// Функция принимает в качестве аргумента другую функцию
fun multiply(func: () -> Unit) {}

fun checkSymbol(char: Char) : Boolean = char == 'e'

fun more_funcs() {
    val str = "Developer interview"

    println( str.count {char -> checkSymbol(char)})
    // или так
    println( str.count {checkSymbol(it)}) // так можно, если использовать it
    // и так можно
    println( str.count { it == 'e'})

    // строка с гласными буквами
    val vowels = "aeoiu"
    // Вывести все символы из str, не входящие в vowels
    println( str.filter { it !in vowels })

    // Функциональный тип
    val type: (Int, Double, Int) -> Int

    // Анонимная функция
    val anonimous: (Int) -> Unit = fun(a: Int) { println(a) }
    // Вызов анонимной функции
    anonimous(123)

    // Примеры лямбда функций
    val lambda = { println("HelloW") }
    val lambdaWithParams = { message: String -> println(message) }
    val lambdaWithParamsAndRetVal = { a: Int, b: Int -> a * b }


}