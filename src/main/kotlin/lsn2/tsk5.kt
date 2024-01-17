package lsn2
import kotlin.math.pow
import kotlin.math.floor

// Lesson 2, task 5
fun main() {
    val depositFunds = 70_000
    val rate = 16.7
    val depositTerm = 20
    println("Через 20 лет размер вклада будет ${floor((depositFunds * (1 + rate / 100).pow(depositTerm)) * 1000.0) / 1000.0}.")
}