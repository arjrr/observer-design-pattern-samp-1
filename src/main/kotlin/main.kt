fun main() {

    println("Welcome to Weather Station!")

    /** Creating an observer */
    val display = Display()

    /** Creating subject and assign the observer for subject */
    val weatherData = WeatherData()
    weatherData.registerObserver(display)

    /** Notify/Change the object of data */
    val data = Data(28.9, 66.2)
    weatherData.setMeasurement(data)

}