package org.example

fun setExamples() {
    val days: Set<String> = setOf("Right", "Left", "Up", "Down")
    val numbers = mutableSetOf(1, 3, 6, 10)

    // Объединение
    val vrtDirections = setOf("North", "South")
    val hrzDirections = setOf("West", "East")
    val allDirections = vrtDirections.union(hrzDirections)
    // Можно так написать
    val unitedDirs = hrzDirections union vrtDirections


    // Найти элементы, которые есть в обеих коллекциях set
    val digits1 = setOf(1, 2, 3, 4, 5)
    val digits2 = setOf(4, 5, 6, 7, 8)
    val digits3 = digits1.intersect(digits2)
    // или так
    val digits7 = digits2 intersect digits1

    // Найти в коллекции элементы, которых нет во второй коллекции set
    val digits4 = digits2.subtract(digits1)
    // или так
    val digits8 = digits1 subtract digits2

}