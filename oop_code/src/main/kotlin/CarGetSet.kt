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

    private var currentSpeed = 0.0
        get() {
            return field // Здесь нельзя писать имя переменной currentSpeed, т.к. иначе получится рекурсивный вызов этой функции
        }
        set(value) {
            field = value // Здесь аналогично
        }

    private var fuelCount = 0.0
        get // Тело функции не описано, но в таком виде будет возвращать значение fuelCount
        private set

    var cargoNumber = 0.0
        private set // Если так сделать, то читать cargoNumber может кто угодно, а изменять только члены этого класса

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

    // Метод доступен только методам данного класса
    private fun useFuel(fuelCount: Double) {
        this.fuelCount -= fuelCount
    }
 }