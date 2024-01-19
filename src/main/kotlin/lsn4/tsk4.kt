package lsn4

// Lesson 4, task 4
fun main() {
    val armsWorkout = "Упражнения для рук"
    val legsWorkout = "Упражнения для ног"
    val backWorkout = "Упражнения для спины"
    val coreWorkout = "Упражнения для пресса"
    val day = 5
    println("""Сегодня $day-й день программы, вот ваша тренировка:
        |$armsWorkout:    ${day % 2 != 0}
        |$coreWorkout: ${day % 2 != 0}
        |$legsWorkout:    ${day % 2 == 0}
        |$backWorkout:  ${day % 2 == 0}
            """.trimMargin())
}