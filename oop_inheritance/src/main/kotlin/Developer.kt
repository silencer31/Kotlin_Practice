package org.example

import kotlin.random.Random

// Этот класс тоже открыт для наследования
open class Developer(
    name: String,
    age: Int,
    val experience: Int = 2
) : Person(name, age) {

    // Эту переменную можно переопределить в классе наследнике
    open val paradigm = "OOP"

    // здесь open означает, что функцию можно переопределить в классе наследнике
    open fun writeCode() = println("Developer writing code")

    fun  getLevel() = when (experience) {
        0 -> "intern"
        in 1..2 -> "junior"
        in 3..4 -> "middle"
        in 4..5 -> "senior"
        else -> "leading"
    }

    // Эта функция доступна только в этом классе. В т.ч. она не доступна в классах наследниках
    private fun getCoffeeBreak() = Random.nextBoolean()


    // protected - Эта функция доступна в классах наследниках, но не доступна извне
    protected fun getTeaBreak() = Random.nextBoolean()
}