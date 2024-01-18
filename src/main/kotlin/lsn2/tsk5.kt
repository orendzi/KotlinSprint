package lsn2
import kotlin.math.pow

// Lesson 2, task 5
fun main() {
    val depositFunds = 70_000
    val rate = 16.7
    val depositTerm = 20
    val compResult = depositFunds * (1 + rate / 100).pow(depositTerm)
    println("Через 20 лет размер вклада будет ${String.format("%.3f",compResult)}.")
}