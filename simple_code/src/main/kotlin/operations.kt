package org.example

fun operationExamples() {
    val numbers = listOf(1, 2, 3, 4, 5)

    // Здесь map это операция преобразования, которая применяет лямбда функцию
    // вместо number можно использовать любое другое имя переменной
    val doubles1 = numbers.map { number -> number * 2 }
    // Если у лямбда функции только один аргумент, записать можно так
    val doubles2 = numbers.map { it * 2 }

    //
    val names = setOf("Ivan", "Anton", "Dmitry", "Sergey")
    // Получить коллекцию из длин элементов names
    val nameLenghts = names.map { it.length }

    //
    val cities = arrayOf("Moscow", "Saint Petersburg", "Novosibirsk")
    // Все большими буквами
    val upperCities = cities.map { it.uppercase() }

    //
    val students = listOf("Alex", "Andrew", "Peter", "Susan")
    // Так можно использовать переменную и её индекс
    val studNums = students.mapIndexed { index, name -> "Student #${index+1}: $name" }

    //
    val someNumbers = listOf(1, -4, 5, -2, 11, 5, -3, -5)
    // Взять только положительные
    val positiveNumbers = someNumbers.filter { it > 0 }

    //
    val studentGrades = mapOf("sasha" to 3, "masha" to 4, "anton" to 4, "sergey" to 5)
    // Создается новая map, но только со значениями больше 3
    val filteredMap = studentGrades.filter { (key, value) -> value > 3}

    //
    val words = listOf("android", null,"java", null, "kotlin", null)
    // Убрать все null
    val notNullWords = words.filterNotNull()

    //
    val numbers2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // Метод slice принимает диапазоны и наборы индексов
    println( numbers2.slice(0..2)) // [1, 2, 3]
    println( numbers2.slice(0 until  2)) // [1, 2]
    println( numbers2.slice(1..3)) // [2, 3, 4]
    println( numbers2.slice(listOf(0, 4))) //[1, 5]
    println( numbers2.slice(5 downTo 1)) //[6, 5, 4, 3, 2]


    val numbers3 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // Через take берём указанное кол-во элементов от начала
    println(numbers3.take(2))
    println(numbers.take(0)) // []
    // Через takeLast берём указанное кол-во элементов от конца
    println(numbers.takeLast(3)) // [8, 9, 10]
    println(numbers.takeLast(1))

    // Получение одного значения из коллекции
    println(numbers.minOrNull()) // Если коллекция пуста, вернёт null
    println(numbers.maxOrNull()) // Если коллекция пуста, вернёт null

    // Можно так, но коллекция не должна быть пустой
    println( numbers.min())
    println( numbers.max())

    // Среднее значение элементов
    println( numbers.average())

    // Сумма всех элементов
    println( numbers.sum())

    // Кол-во элементов в коллекции
    println( numbers.count())

    // Подсчет кол-ва элементов, удовлетворяющих условию через лямбда функцию
    println(numbers.count { it > 2 })


    // Получить отсортированную коллекцию
    val sortedNumbers = someNumbers.sorted()
    // В порядке убывания
    val descendNumbrs = someNumbers.sortedDescending()

    // Сортировка коллекции в собственном порядке
    // Получение коллекции, отсортированной по длине элементов
    val sortedStuds = students.sortedBy { it.length }

    // Получить коллекцию в обратном порядке от изначального
    val reversedStuds =  students.reversed()

    // Цепочка вызовов
    // Все большими буквами и отсортированы по алфавиту
    println(students.map {it.uppercase()}.sorted())

    // Создать список с элементами от 1 до 10 включительно, каждый умножить на 10 и посчитать сумму.
    println((1..10).map { it * 10 }.sum())
    // или так, то же самое
    println((1..10).sumOf { it * 10 })

    // Каждый элемент множества умножаем на -1, потом на 2 и потом каждый выводим в консоль
    setOf(1, 11, 12, 33, 4, 5, 6, 7, 8)
        .map { it * -1 }
        .map { it * 2 }
        .forEach {
            println(it)
        }

    // Получить массив символов из строки можно с помощью метода строки toCharArray(),
    // а код символа — через свойство code. Например, ‘c’.code.
}