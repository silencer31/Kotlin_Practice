package org.example

fun main() {
    val  vw = CarParams(brand = "VW", model = "Polo", color = "White")

    // Создание объекта через доп конструктор
    val volga = CarSecond(descriptor = "Volga" to "gaz24", color = "Grey")

    // Обращение к объекту типа Singleton
    Tower.turnOnBacklights()
    Tower.turnOffBacklights()
    println("Tower height: ${Tower.height}")

    // Так можно, но обе переменные будут ссылаться на один и тот же объект
    val tower1 = Tower
    val tower2 = Tower

    // Объект компаньон класса CarCompanion
    println("${CarCompanion.wheelsCount}")
    val classType = CarCompanion.getCarClass(3.8)
    println(classType)

    val carComp = CarCompanion("Audi", "A3")
    // carComp.getCarClass(4) Так не сработает. Доступ к компаньону только через имя класса
    // carComp.wheelsCount К этой константе нет доступа через объект на основе класса. Только через имя класса


}

fun printInfo(car: CarConstr) {
    println("Brand: ${car.brand}, model: ${car.model}, color: ${car.color}")
}