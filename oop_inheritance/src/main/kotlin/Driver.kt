package org.example

class Driver(
    nameArg: String,
    ageArg: Int,
    val experience: Int // nameArg и ageArg - только входные параметры. experience - член  класса Driver
) : Person(nameArg, ageArg) {
    fun drive() = println("driving")
}