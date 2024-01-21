package lsn4

// Lesson 4, task 3
const val SUNNY_WEATHER = true
const val OPEN_TENT = true
const val LOW_HUMIDITY = 20
const val IMPROPER_SEASON = "зима"
fun main() {
    val isSunnyWeather = true
    val isOpenTent = true
    val humidity = 20
    val currentSeason = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${isSunnyWeather == SUNNY_WEATHER && isOpenTent == OPEN_TENT && humidity == LOW_HUMIDITY && currentSeason != IMPROPER_SEASON}")
}