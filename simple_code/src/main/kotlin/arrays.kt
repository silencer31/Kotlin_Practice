package org.example

fun arrayExamples() {
    // Arrays
    val numbers : IntArray = IntArray(5) {7}

    println("Same numbers: ${numbers.joinToString(", ")}")

    // Nullable type
    val nlNumbers : Array<Int?> = Array(5) {null}

    // Short form
    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    println("Days: ${days.joinToString(" -> ")}")

    // Inited by nulls
    val nVals = arrayOfNulls<Int>(4)

    println("Nulls: ${nVals.joinToString(" : ")}")

    val someDigits = arrayOf(1, 2, 3, 4, 0, 9, 8)
    for(i in 0 .. someDigits.size - 1) { // i in 0 until someDigits.size
        print("Dig 1: ${someDigits[i]} ")
    }
    println()

    for(i in  someDigits.indices) {
        print("Dig 2: ${someDigits[i]} ")
    }
    println()

    for(element in someDigits) {
        print("Dig 3: $element ")
    }
    println()

    // Any type of values. Type cast is needed to use every element
    val anyVals = Array<Any?>(3) { null }
}