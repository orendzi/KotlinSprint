package lsn3

// Lesson 3, task 3
fun main() {
    println("Введите число от 1 до 9:")
    val userInput: String = readln()
    if(userInput.matches("[1-9]".toRegex())) {
        val baseNum = userInput.toInt()
         println(
            """
            $baseNum x 1 = ${baseNum * 1}
            $baseNum x 2 = ${baseNum * 2}
            $baseNum x 3 = ${baseNum * 3}
            $baseNum x 4 = ${baseNum * 4}
            $baseNum x 5 = ${baseNum * 5}
            $baseNum x 6 = ${baseNum * 6}
            $baseNum x 7 = ${baseNum * 7}
            $baseNum x 8 = ${baseNum * 8}
            $baseNum x 9 = ${baseNum * 9}
            $baseNum x 10 = ${baseNum * 10}
        """.trimIndent()
        )
    } else {
        println("Введённые данные не соответсвуют условиям.")
    }
}