package lsn4

// Lesson 4, task 3
fun main() {
    val isSunny_weather = true
    val isOpen_tent = true
    val humidity = 20
    val currentSeason = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${isSunny_weather && isOpen_tent && humidity == 20 && currentSeason != "зима"}")
}