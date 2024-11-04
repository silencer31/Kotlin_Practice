package org.example

// Функция принимает в качестве аргумента другую функцию.
// Аргумент этой функции имеет функциональный тип
// Unit означает, что функция ничего не возвращает
fun multiply(func: () -> Unit) {}

fun checkSymbol(char: Char) : Boolean = char == 'e'

fun more_funcs() {
    val str = "Developer interview"

    println( str.count {char -> checkSymbol(char)})
    // или так. Здесь it это аргумент, который функция count передает в функцию checkSymbol
    println( str.count {checkSymbol(it)}) // так можно, если использовать it
    // и так можно
    println( str.count { it == 'e'})

    // строка с гласными буквами
    val vowels = "aeoiu"
    // Вывести все символы из str, не входящие в vowels
    // !in - не входит в строку vowels
    println( str.filter { it !in vowels })

    // Функциональный тип
    val type1: (Int) -> String
    val type2: (Int, Double, Int) -> Int

    // Анонимная функция
    // Здесь anonimous, это название переменной функционального типа
    // Функциональный тип позволяет присваивать переменным анонимные функции и лямбда выражения
    val anonimous: (Int) -> Unit = fun(a: Int) { println(a) }
    // Вызов анонимной функции
    anonimous(123)

    // Примеры лямбда функций
    // Лямбда выражение, это анонимная функция, записанная в виде выражения
    // Всё выражение д/б заключено в фигурные скобки
    // До -> указываются параметры
    // После -> находится тело функции
    // Возвращаемым значением считается последняя строка тела функции
    // В отличие от анонимных функций нельзя явно использовать оператор return
    val lambda = { println("HelloW") }
    val lambdaWithParams = { message: String -> println(message) }
    val lambdaWithParamsAndRetVal = { a: Int, b: Int -> a * b } // Возвращает Int
    val lambdaWithParamsNoRetVal = { a: Int, b: Int ->
        val mult = a * b
        println(mult)
    } // Ничего не возвращает

}