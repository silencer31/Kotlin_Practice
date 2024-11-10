package org.example

fun main() {
    val person = Person("Anton", 34)
    val driver = Driver("Ivan", 46, 5)

    person.name
    person.age
    person.sleep()
    person.eat()
    person.walk()

    // Все члены и функции базового класса доступны в производном
    driver.name
    driver.age
    driver.experience
    driver.sleep()
    driver.eat()
    driver.walk()
    driver.drive()


}