package lsn4

// Lesson 4, task 2
const val CAT_AVERAGE_MIN_WEIGHT = 35
const val CAT_AVERAGE_MAX_WEIGHT = 100
const val CAT_AVERAGE_VOLUME = 100
fun main() {
    val cargo1Weight = 20
    val cargo1Volume = 80
    val cargo2Weight = 50
    val cargo2Volume = 100

    println("Груз с весом $cargo1Weight кг и объёмом $cargo1Volume л сооветствует категории 'Average': " +
            "${cargo1Weight >= CAT_AVERAGE_MIN_WEIGHT && cargo1Weight <= CAT_AVERAGE_MAX_WEIGHT && cargo1Volume < CAT_AVERAGE_VOLUME}.")

    println("Груз с весом $cargo2Weight кг и объёмом $cargo2Volume л сооветствует категории 'Average': " +
            "${cargo2Weight >= CAT_AVERAGE_MIN_WEIGHT && cargo2Weight <= CAT_AVERAGE_MAX_WEIGHT && cargo2Volume < CAT_AVERAGE_VOLUME}.")
}