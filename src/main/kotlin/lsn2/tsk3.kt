package lsn2

// Lesson 2, task 3
const val TIME_UNIT = 60
fun main() {
    val travelTime = 457
    val departureHour = 9
    val departureMinutes = 39

    val departureInMinutes = (departureHour * TIME_UNIT) + departureMinutes
    val arrivalHour = (departureInMinutes + travelTime) / TIME_UNIT
    val arrivalMinute = (departureInMinutes + travelTime) % TIME_UNIT
    println("$arrivalHour:$arrivalMinute")
}
