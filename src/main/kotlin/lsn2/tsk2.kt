package lsn2

// Lesson 2, task 2
fun main() {
    val employees = 50
    val trainees = 30
    val employeesWaste = employees * 30000
    val traineesWaste = trainees * 20000
    val totalWaste = employeesWaste + traineesWaste
    val averageSalary = totalWaste / (employees + trainees)
    println("$employeesWaste\n$totalWaste\n$averageSalary")
}