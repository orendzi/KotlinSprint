package lsn1

// Lesson 1, task 3
fun main() {
    // immutable var
    val year = 1961

    // mutable var
    var hour = "09"
    var minute = "07"

    println(year)
    println(hour)
    println(minute)

    hour = "10"
    minute = "55"
    println(hour + ":" + minute)
}