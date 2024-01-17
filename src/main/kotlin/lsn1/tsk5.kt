package lsn1

// Lesson 1, task 5
const val TIME_UNIT = 60
fun main() {
    var seconds = 6480
    var minutes = seconds / TIME_UNIT
    val hours = minutes / TIME_UNIT
    minutes = minutes - TIME_UNIT
    seconds -= seconds
    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}