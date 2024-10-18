package org.example

// Возврат значения через when
fun getUserRole(income: Int) : String = when (income) {
    in 0..10 -> "editor"
    in 11..21 -> "consumer"
    in 22..30 -> "host"
    else -> "random man"
}

fun condition_examples() {

    // Возвращаемое значение оператора if
    var response: String = if (getUserRole(3) == "editor") {
        "У пользователя есть права на редактирование"
    } else {
        "Пользователь не может редактировать документы"
    }

    // Так тоже можно, но лучше не стоит
    val price = Math.random() * 20
    val amount = 10
    // Тип переменной определяется на лету
    val totalPrice = if (price > 10) price * amount else "Неверно введена цена"
    println(totalPrice)


    // Оператор when
    val mistakesAmount: Int = 2
    // Что делать, если < 0
    if (mistakesAmount < 0) {
        println("Некорректные данные")
        return
    }
    // 0, 1, 2 и остальные варианты
    when (mistakesAmount) {
        0 -> println("Оценка 5")
        1 -> println("Оценка 4")
        2 -> println("Оценка 3")
        else -> println("Оценка 2")
    }

    // in Int.MIN_VALUE..0  -  проверяется вхождение в диапазон от -2147483648 до 0
    when (mistakesAmount) {
        in Int.MIN_VALUE..0 -> println("Некорректные данные")
        0 -> println("Оценка 5")
        1 -> println("Оценка 4")
        2 -> println("Оценка 3")
        else -> println("Оценка 2")
    }

    // Отдельные проверки условий
    when {
        mistakesAmount < 0 -> println("Некорректные данные")
        mistakesAmount == 0 -> println("Оценка 5")
        mistakesAmount == 1 -> println("Оценка 4")
        mistakesAmount == 2 -> println("Оценка 3")
        else -> println("Оценка 2")
    }


}