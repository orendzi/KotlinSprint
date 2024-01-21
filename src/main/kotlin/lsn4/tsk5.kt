package lsn4

// Lesson 4, task 5
const val DAMAGE_CONDITION = false
const val LOW_DAMAGE_CONDITION = true
const val MIN_CREW_CONDITION = 55
const val MAX_CREW_CONDITION = 70
const val RECOMMENDED_CREW_CONDITION = MAX_CREW_CONDITION
const val FOOD_CONDITION = 50
const val WEATHER_CONDITION = true

fun main() {
    println("Введите тип экспедиции: \"обычная\" или \"сложная?\"")
    val expeditionType = readln()

    println("Имеет ли корабль повреждения? Введите \"нет\", \"небольшие\" или \"серьёзные\":")
    val damageInput = readlnOrNull()
    var hasDamage = false
    var hasLowDamage = false

    if(damageInput != null) {
        when(damageInput) {
            "нет" -> {hasDamage = false; hasLowDamage = false}
            "небольшие" -> {hasDamage = true; hasLowDamage = true}
            "серьёзные" -> {hasDamage = true; hasLowDamage = false}
            else -> {println("Введены некорректные данные"); return}
        }
    }

    println("Сколько человек составляет экипаж? Введите число:")
    val crewQuantity = readln().toIntOrNull()
    println("Сколько ящиков с провизией на борту? Введите число:")
    val foodBoxQuantity = readln().toIntOrNull()

    if (crewQuantity == null || foodBoxQuantity == null) println("Введённые данные не корректны.")
    else {
        when (expeditionType) {
            "обычная" -> {
                val result = hasLowDamage == LOW_DAMAGE_CONDITION || hasDamage == DAMAGE_CONDITION && crewQuantity == RECOMMENDED_CREW_CONDITION && foodBoxQuantity > FOOD_CONDITION
                val permission = if(result) "да" else "нет"
                println("Обычная экспедиция разрешена: $permission.")
            }
            "сложная" -> {
                println("Благоприятна ли погода для экспедиции? Введите \"да\" или \"нет\":")
                val weatherInput = readln()
                val isGoodWeather = weatherInput == "да"

                val result = hasDamage == DAMAGE_CONDITION && crewQuantity > MIN_CREW_CONDITION && crewQuantity <= MAX_CREW_CONDITION && foodBoxQuantity >= FOOD_CONDITION && isGoodWeather == WEATHER_CONDITION
                val permission = if(result) "да" else "нет"
                println("Сложная экспедиция разрешена: $permission.")
            }
            else -> {println("Тип экспедиции выбран неверно.")}
        }
    }
}
