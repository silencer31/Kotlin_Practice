package org.example

// Абстрактный класс
abstract class Transporter(
    val maxWeight: Int
) {
    // Абстрактные свойства нельзя описывать через конструктор класса. Нужно писать именно в теле класса.
    abstract val capacity: Int

    abstract fun move()
}