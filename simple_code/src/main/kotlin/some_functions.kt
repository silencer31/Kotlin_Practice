package org.example

import kotlin.random.Random

//
fun moveLeft(text: String, amount: Int): String {
    return text.map { c -> c - amount }.joinToString("")
}

fun moveRight(text: String, amount: Int): String {
    return text.map { c -> c + amount }.joinToString("")
}

fun some_funcs() {
    // Random.nextInt(20) будет выдавать числа в интервале от 0 до 19
    val hiddenNumber = Random.nextInt(20) + 1

    //
    val tempStr : String = "[()[{()}][]]"
    val removed = tempStr.replace("()", "").replace("[]","").replace("{}", "")

    //
    val temperature: Byte = -12
    var travelDistance: Short = 1400
    val cityPopulation: Int = 12000000
    var skuId: Long = 120030100301000304

    var carPrice: Int = 2_478_000

    var weight = 14f

    val g = 'g'
    val c = g - 4
    val d = 'd'
    val j = 'j'
    val diff = j - d // 6

    // Nullable-типы
    val name: String? = null
    var age: Int? = 13

    // Оператор «?.»
    var name1: String? = "Вася"
    var name2: String? = null
    //println(name1.uppercase()) // Так не сработает, т.к. в name1 может быть null
    println(name2?.uppercase()) // Через ?. можно

    // Оператор «?:»
    // Если переменная не null, то используется то, что в ней, а если null, то значение справа
    var profession1: String? = "Столяр"
    var profession2: String? = null
    val defaultProfession = "Не указано"
    println(profession1 ?: defaultProfession)
    println(profession2 ?: defaultProfession)

    // Оператор «!!» - утверждение, что это не null
    // Так сработает
    val nullableString: String? = "not null string"
    val newString: String = nullableString!!
    // А так будет ошибка
    val nullableString2: String? = null
    val newString2: String = nullableString!!
}