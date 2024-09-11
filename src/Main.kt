fun main() {
    val celToFah : (Double) -> Double = { temp ->
        (9.0 / 5.0) * it + 32
    }

   val kelToCel : (Double) -> Double = {
       it + 273.15
   }

    val fahToKel : (Double) -> Double = {
        (5.0 / 9.0) * (it - 32) + 273.15
    }

    printFinalTempature(initialMeasurement:27.0, initial "Celsius", finalunit:"Fahrenheit", celToFah )
    printFinalTempature(initialMeasurement:350.0, initial "Celsius", finalunit:"Kelvin", celToFah ) {it + 273.35}
    printFinalTempature(initialMeasurement:10.0, initial "Kelvin", finalunit:"Fahrenheit", celToFah )



fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}