package lsn4

// Lesson 4, task 5
const val DAMAGE_CONDITION = false
const val MIN_CREW_CONDITION = 55
const val MAX_CREW_CONDITION = 70
const val FOOD_CONDITION = 50
const val WEATHER_CONDITION = true

fun main() {
    println("Имеет ли корабль повреждения? Введите true/false:")
    val hasDamage = readln().toBooleanStrictOrNull()
    println("Сколько человек составляет экипаж? Введите число:")
    val crewQuantity = readln().toIntOrNull()
    println("Сколько ящиков с провизией на борту? Введите число:")
    val foodBoxQuantity = readln().toIntOrNull()
    println("Благоприятна ли погода для экспедиции? Введите true/false:")
    val isGoodWeather = readln().toBooleanStrictOrNull()

    if (hasDamage == null || crewQuantity == null || foodBoxQuantity == null || isGoodWeather == null) println ("Введённые данные не корректны.")
    else println("Экспедиция разрешена: ${hasDamage == DAMAGE_CONDITION && crewQuantity > MIN_CREW_CONDITION && crewQuantity <= MAX_CREW_CONDITION && foodBoxQuantity >= FOOD_CONDITION && isGoodWeather == WEATHER_CONDITION}")
}