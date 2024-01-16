package lsn1

// Lesson 1, task 5
fun main() {
    var seconds = 6480
    var minutes = seconds / 60
    val hours = minutes / 60
    minutes = minutes - 60
    seconds -= seconds
    println("First human's time in space is $hours:$minutes:$seconds")
}