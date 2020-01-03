package designPatterns.e001_Adapter

fun main() {
    val metric = MetricLength(25.4)
    val imperial = ImperialLength(metric)

    metric.length = 50.8
    println("${metric.length} cm = ${imperial.length} inches")

    imperial.length = 1.0
    println("${metric.length} cm = ${imperial.length} inches")
}