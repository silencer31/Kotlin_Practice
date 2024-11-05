package org.example

// С блоком Init
class CarCompanion(val brand: String, val model: String, val color: String = "Black") {
    // Дополнительный конструктор.
    // Он всегда должен вызывать первичный конструктор через this
    // В этом конструкторе нельзя создавать поля класса, нельзя писать val
    constructor(descriptor: Pair<String, String>, color: String) : this(
        brand = descriptor.first,
        model = descriptor.second,
        color = color
    )

    // Блок кода, выполняемый первичным конструктором
    init {
        println("Car init")
    }

    var currentSpeed = 0.0

    companion object {
        const val wheelsCount = 4
        fun getCarClass(length: Double): String = when {
            length < 3.6 -> "A"
            length < 3.9 -> "B"
            length < 4.3 -> "C"
            length < 4.6 -> "D"
            length < 5 -> "E"
            else -> "F"
        }
    }

}