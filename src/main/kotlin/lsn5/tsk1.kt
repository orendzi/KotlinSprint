package lsn5

// Lesson 5, task 1
const val TASK_NUM_A = 3
const val TASK_NUM_B = 8
fun main() {
    println("Hello, guest! Prove you are not bot and solve this simple task: $TASK_NUM_A + $TASK_NUM_B")
    val userInput = readln().toIntOrNull()
    if (userInput == TASK_NUM_A + TASK_NUM_B) println ("Authorization success!")
    else println ("Access denied.")
}