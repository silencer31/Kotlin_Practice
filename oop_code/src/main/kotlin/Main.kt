package org.example

fun main() {
    val  vw = CarParams(brand = "VW", model = "Polo", color = "White")

    // Создание объекта через доп конструктор
    val volga = CarSecond(descriptor = "Volga" to "gaz24", color = "Grey")
}

fun printInfo(car: CarConstr) {
    println("Brand: ${car.brand}, model: ${car.model}, color: ${car.color}")
}