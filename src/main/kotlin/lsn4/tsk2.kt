package lsn4

// Lesson 4, task 2
fun main() {
    val catAverage_minWeight = 35
    val catAverage_maxWeight = 100
    val catAverage_Volume = 100
    val cargo1_Weight = 20
    val cargo1_Volume = 80
    val cargo2_Weight = 50
    val cargo2_Volume = 100

    println("Груз с весом $cargo1_Weight кг и объёмом $cargo1_Volume л сооветствует категории 'Average': " +
            "${cargo1_Weight >= catAverage_minWeight && cargo1_Weight <= catAverage_maxWeight && cargo1_Volume < catAverage_Volume}.")

    println("Груз с весом $cargo2_Weight кг и объёмом $cargo2_Volume л сооветствует категории 'Average': " +
            "${cargo2_Weight >= catAverage_minWeight && cargo2_Weight <= catAverage_maxWeight && cargo2_Volume < catAverage_Volume}.")
}