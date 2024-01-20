package lsn5
import kotlin.random.Random

// Lesson 5, task 3
fun main () {
    val numA = Random.nextInt(0, 42)
    val numB = Random.nextInt(0, 42)

    println("Hello, enter the first number in range of 0 - 42, please:")
    val userNumA = readln().toIntOrNull()
    println("Enter the second number in the same range, please:")
    val userNumB = readln().toIntOrNull()
    if (userNumA == null ||userNumB == null) return

    if((userNumA == numA || userNumA == numB) && (userNumB == numA || userNumB == numB)) {
        println("Congratulations!\nYou've guessed both numbers: $numA, $numB.\nYou get the main prize!")
    } else if ((userNumA == numA || userNumA == numB) || (userNumB == numA || userNumB == numB)) {
        println("You've guessed only one number.\nThe numbers are: $numA, $numB.\nYou get some little prize!")
    } else {
        println("Failure.\nThe numbers are: $numA, $numB.")
    }
}