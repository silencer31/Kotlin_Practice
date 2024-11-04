package org.example

// Функции высшего порядка могут принимать в качестве аргумента другие функции

// Здесь 4тый аргумент имеет функциональный тип
// Названия его параметров могут совпадать с названиями параметров самой функции calculateSavings
// В данном случае в качестве четвертого аргумента нужно передавать функцию, которая принимает 4 параметра и ничего не возвращает

fun calculateSavings(salary: Int,
                     rate: Double = 0.3,
                     period: Int = 12,
                     printInfo: (salary: Int, rate: Double, period: Int, bank: Double) -> Unit ) : Double
{
    val netSalary = salary * 0.87
    val bank = netSalary * rate * period

    return bank
}

// Функциональный тип м/б nullable и принимать значения по умолчанию
// В этой функции 4тый аргумент можно не передавать
fun calculateSavingsNull(salary: Int,
                     rate: Double = 0.3,
                     period: Int = 12,
                     printInfo: ((piSalary: Int, piRate: Double, piPeriod: Int, piBank: Double) -> Unit)? = null ) : Double
{
    val netSalary = salary * 0.87
    val bank = netSalary * rate * period

    // Если 4тый аргумент функции calculateSavingsNull не будет передан, это не будет вызвано благодаря ?.
    printInfo?.invoke(salary, rate, period, bank)

    return bank
}