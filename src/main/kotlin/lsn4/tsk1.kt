package lsn4

// Lesson 4, task 1
const val TABLES_TOTAL = 13
fun main() {
    val todayReservedTables = TABLES_TOTAL
    val tomorrowFreeTables = 4
    val tomorrowReservedTables = TABLES_TOTAL - tomorrowFreeTables
    val todayReserve = todayReservedTables < TABLES_TOTAL
    val tomorrowReserve = tomorrowReservedTables < TABLES_TOTAL
    println("Доступность столиков на сегодня: $todayReserve,\n" +
            "Доступность столиков на завтра: $tomorrowReserve.")
}