package org.example

// С неявным конструктором
class CarImpl {

}

// С конструктором (первичный конструктор)
class CarConstr(brandArg: String, modelArg: String, colorArg: String) {
    // Поля класса
    val brand = brandArg
    val model = modelArg
    val color = colorArg
}

// Здесь параметры конструктора сразу являются полями класса
class CarParams(val brand: String, val model: String, val color: String = "Black") {

}

// Со вторичным конструктором
class CarSecond(val brand: String, val model: String, val color: String = "Black") {
    // Дополнительный конструктор.
    // Он всегда должен вызывать первичный конструктор через this
    // В этом конструкторе нельзя создавать поля класса, нельзя писать val
    constructor(descriptor: Pair<String, String>, color: String) : this(
        brand = descriptor.first,
        model = descriptor.second,
        color = color
    )
}

// С блоком Init
class CarInit(val brand: String, val model: String, val color: String = "Black") {
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

    // Блоков init может быть несколько
    init {
        println("Second init")
    }
}

// С блоком Init
class CarInitSecond(val brand: String, val model: String, val color: String = "Black") {
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

    // Блоков init может быть несколько
    init {
        println("Second init")
    }
}

