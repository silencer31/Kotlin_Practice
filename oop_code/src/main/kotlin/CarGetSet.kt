package org.example

// С блоком Init
class CarGetSet(val brand: String, val model: String, val color: String = "Black") {
    // Дополнительный конструктор.
    // Он всегда должен вызывать первичный конструктор через this
    // В этом конструкторе нельзя создавать поля класса, нельзя писать val
    constructor(descriptor: Pair<String, String>, color: String) : this(
        brand = descriptor.first,
        model = descriptor.second,
        color = color
    ) { // Этот блок кода будет выполнен после выполнения всех блоков init
        println("Secondary constructor")
    }

    // Блок кода, выполняемый первичным конструктором
    init {
        println("Car init")
    }

    var currentSpeed = 0.0
    var fuelCount = 0.0

    // Блоков init может быть несколько
    init {
        println("Second init")
    }

    fun accelerate(speed: Double) {
        currentSpeed += speed
    }

    fun decelerate(speed: Double) {
        currentSpeed -= speed
    }

    fun useF
 }