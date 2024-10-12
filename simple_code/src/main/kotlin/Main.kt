package org.example

fun main() {
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

    // Lists
    // const size
    val strList = listOf("str_1", "str_2", "str_3")

    // mutable
    val strMtlEmptyList = mutableListOf<String>()

    val strMtlInitedList = mutableListOf("mstr_1", "mstr_2", "mstr_3")

    val digList1 = listOf<Int>(1, 2, 3)
    val digList2 = listOf<Int>(4, 5, 6)
    val digList3 = digList1.plus(digList2)
    val digList4 = listOf<Int>(3, 4)
    val digList5 = digList3.minus(digList4)


}