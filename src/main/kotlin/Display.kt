class Display : Observer {
    override fun update(data: Data) {
        println("Temperature: ${data.temperature}, Humidity: ${data.humidity}")
    }
}