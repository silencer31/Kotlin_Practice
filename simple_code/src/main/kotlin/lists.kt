package org.example

fun listExamples() {
    // Lists
    // const size
    val strList = listOf("str_1", "str_2", "str_3")

    // mutable
    val strMtlEmptyList = mutableListOf<String>()

    val strMtlInitedList = mutableListOf("mstr_1", "mstr_2", "mstr_3")

    val digList1 = listOf<Int>(1, 2, 3)
    val digList2 = listOf<Int>(4, 5, 6)

    // Объединение списков
    val digList3 = digList1.plus(digList2)
    val digList4 = listOf<Int>(3, 4)

    // Вычитание списков
    val digList5 = digList3.minus(digList4)

    // Ещё вариант создания списка
    val numbers = (0..9).toList()
    println("nums: ${numbers.joinToString(", ")}")

    // Взять диаппазон из списка
    val subNumbers = numbers.subList(1, 3)
    println("sub nums: ${subNumbers.joinToString(", ")}")

    // Узнать номер элемента в списке по значению
    println("position of 4 in numbers: ${numbers.indexOf(4)}")
    // Если искомое значение отсутствует, будет -1
    println("position of 12 in numbers: ${numbers.indexOf(12)}")

    // Добавление элементов в изменяемый список
    val mtlListNumbers = mutableListOf<Int>(1, 2, 3)

    mtlListNumbers.add(6)
    mtlListNumbers.addAll(listOf(9, 8, 5))

    // Удаление элемента по индексу
    mtlListNumbers.removeAt(4)

    // mtlListNumbers.removeAt(10) // Exeption из-за неверного индекса

    // Получить первые N элементов
    println( mtlListNumbers.take(2))

    // Получить последние N элементов
    println( mtlListNumbers.takeLast(3))
}