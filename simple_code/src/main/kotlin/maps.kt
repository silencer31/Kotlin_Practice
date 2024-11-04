package org.example

fun mapExamples() {
    // Используя Pair
    val grades1: Map<String, Int> = mapOf(
        Pair("Sergey", 5),
        Pair("Ivan", 4),
        Pair("Pavel", 4),
    )

    // или так можно
    val grades2: Map<String, Int> = mapOf(
        "Nastya" to 5,
        "Vera" to 4,
        "Olga" to 4,
    )

    // Изменяемая
    val priceMap = mutableMapOf(
        "Cucumber" to 10,
        "Chicken" to 20,
        "Banana" to 30,
        "Carrot" to 40,
    )

    // Добавление
    priceMap.put("Potato", 50)
    priceMap.putAll(mapOf("Turkey" to 50, "Beef" to 60))
    // При добавлении элемента, который уэе есть в Map, он заменяется на новый , а оператор put вернёт старое значение
    val oldValue = priceMap.put("Cucumber", 20)


    // Изменение значения
    priceMap["Banana"] = 45

    // Получение элемента
    // Если указанного ключа нет, вернётся null
    val result1 = priceMap["Chicken"]
    // Если указанного ключа нет, вернёт указанное значение
    val result2 = priceMap.getOrDefault("Water", 0)

    // Сложение словарей
    // Если элемент есть в обоих Map, его значением будет значение из второго словаря
    val allGrades = grades1 + grades2

    // Вычитание
    // При этом действии из Map вычитается не другая Map, а ключ или список ключей
    val grades3 = grades1 - "Pavel"
    val grades4 = grades2 - listOf("Nastya", "Vera")

    // Удаление элемента
    // Удаление по ключу
    priceMap.remove("Chicken")

    // Удаление по значению. Если есть несколько одинаковых значений, удалится первый найденный.
    priceMap.values.remove(50)
}