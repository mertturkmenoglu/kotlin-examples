package designPatterns.e001_Adapter

class ImperialLength(var metricLength: MetricLength) : Length {
    override var length: Double
        get() = convertMetricToImperial(metricLength.length)
        set(lengthInInches) {
            metricLength.length = convertImperialToMetric(lengthInInches)
        }

    private fun convertImperialToMetric(inches: Double): Double = inches * 2.54
    private fun convertMetricToImperial(metric: Double): Double = metric / 2.54
}