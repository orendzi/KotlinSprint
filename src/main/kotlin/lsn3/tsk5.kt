package lsn3

// Lesson 3, task 5
fun main() {
    val moveData = "D2-D3; 0"
    val splitData = moveData.split("-", ";")
    val moveFrom = splitData[0]
    val moveTo = splitData[1]
    val moveNum = splitData[2]
    println("""
        $moveFrom
        $moveTo
       $moveNum
    """.trimIndent())
}