package lsn2

// Lesson 2, task 4
fun main() {
    val percentage = 100
    val buff = 20
    val ironOre = 11
    val crystalOre = 7
    val ironOreBuff = ironOre * buff / percentage
    val crystalOreBuff = crystalOre * buff / percentage
    println(ironOreBuff)
    println(crystalOreBuff)
}