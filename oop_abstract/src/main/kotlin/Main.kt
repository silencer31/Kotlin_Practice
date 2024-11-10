package org.example

import kotlin.random.Random

fun main() {
    val boeing737 = createBoeing()

    println(boeing737.getInfo())
    boeing737.getSeatScheme()


    val zeppelin = createZeppelin()

    println(zeppelin.getInfo())
    zeppelin.getSeatScheme()
}

fun createBoeing() : Boeing737 {
    val boeing737 = Boeing737()
    val passengersCount = Random.nextInt(1, boeing737.capacity)

    for (i in 0 until passengersCount) {
        // Выходим из цикла рассадки, если свободные места закончились
        val seat = boeing737.getAvailableSeat() ?: return boeing737

        val passenger = Passenger(
            name = "Ivan",
            lastName = "Petrov",
            passport = "${Random.nextInt(1000, 9999)} ${Random.nextInt(100000, 999999)}",
            seat = seat
        )

        boeing737.addPassenger(passenger)
    }

    return boeing737
}

fun createZeppelin() : Zeppelin {
    val zeppelin = Zeppelin()
    val zeppelinPassengers = Random.nextInt(1, zeppelin.capacity)

    for (i in 0 until zeppelinPassengers) {
        // Выходим из цикла рассадки, если свободные места закончились
        val seat = zeppelin.getAvailableSeat() ?: return zeppelin

        val passenger = Passenger(
            name = "Ivan",
            lastName = "Petrov",
            passport = "${Random.nextInt(1000, 9999)} ${Random.nextInt(100000, 999999)}",
            seat = seat
        )

        zeppelin.addPassenger(passenger)
    }

    return zeppelin
}