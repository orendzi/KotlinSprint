package lsn5
import kotlin.random.Random

// Lesson 5, task 5
fun main() {
    val numGenList: List<Int> = listOf(
        Random.nextInt(0, 42),
        Random.nextInt(0, 42),
        Random.nextInt(0, 42)
    )

    println("Введите три числа в диапазоне от 0 до 42:")
    val userNumList = listOf(1, 2, 3).map{ print("$it: "); readln().toIntOrNull()}
    val guessedNums = userNumList.intersect(numGenList).size

    when(guessedNums) {
        3 -> println("Вы угадали все три числа и выиграли джекпот.")
        2 -> println("Вы угадали лишь два числа и выиграли крупный приз.")
        1 -> println("Вы угадали лишь одно число и выиграли утешительный приз.")
        else -> println("Вы ничего не угадали...")
    }
    println("Сгенерированные числа: ${numGenList.joinToString(" ")}")
}