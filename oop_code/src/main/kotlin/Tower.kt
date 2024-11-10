package org.example

// Объект типа Singleton
object Tower {
    private var backlightsOn = false
    val height = 324

    fun turnOnBacklights() {
        backlightsOn = true
    }

    fun turnOffBacklights() {
        backlightsOn = false
    }
}