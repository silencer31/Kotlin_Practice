package org.example

abstract class Aircraft(maxWeight: Int) : Transporter(maxWeight) {
    abstract val brand: String
    abstract val model: String
    abstract val engineCount: Int
    abstract val altitude: Int

    abstract val rows: Int
    abstract val numberOfSeatsInARow: Int

    // Схема посадки пассажиров - список изменяемых списков пассажиров в одном ряду
    // by lazy означает, что это поле будет инициализировано в момент первого обращения к нему
    // Это нужно, т.к. иначе мы его инициализируем значениями абстрактных полей
    protected val seatScheme by lazy {
        List(rows) {
            MutableList<Passenger?>(numberOfSeatsInARow) {
                null
            }
        }
    }

    // Добавление пассажира
    fun addPassenger(passenger: Passenger) {
        val row = passenger.seat.row
        val number = passenger.seat.letter - 'A'

        seatScheme[row][number] = passenger
    }

    // Получение пассажира по месту. Может вернуть null
    fun getPassenger(seat: Seat) : Passenger? {
        val row = seat.row
        val number = seat.letter - 'A'

        return seatScheme[row][number]
    }

    abstract fun getSeatScheme()

    fun getInfo() =
        """Aircraft: $brand $model
            |Max Weight: $maxWeight
            |Capacity: $capacity
            |Number of rows: $rows
            |Number of seats in a row: $numberOfSeatsInARow
        """.trimMargin()

    fun getAvailableSeat(): Seat? {
        val availableSeats = mutableListOf<Seat>()

        seatScheme.forEachIndexed { rowIndex, row ->
            row.forEachIndexed { seatIndex, passenger ->
                if (passenger == null)
                    availableSeats.add( Seat(rowIndex, 'A' + seatIndex))
            }
        }

        return availableSeats.randomOrNull()
    }

    override fun move() {
        println("Aircraft is flying")
    }
}