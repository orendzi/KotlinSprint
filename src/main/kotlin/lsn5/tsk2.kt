package lsn5
import java.time.LocalDate

// Lesson 5, task 2
const val AGE_OF_MAJORITY = 18
fun main() {
    println("Enter your year of birth, please:")
    val userBirthYear = readln().toIntOrNull()
    val currentYear = LocalDate.now().year
    if(userBirthYear != null && userBirthYear.toString().length == 4) {
        if(currentYear - userBirthYear < AGE_OF_MAJORITY) println("Sorry, come again later.")
        else println("Show adult content.")
    } else {
        println("Incorrect data.")
    }
}