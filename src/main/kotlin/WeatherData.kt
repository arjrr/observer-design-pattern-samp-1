class WeatherData : Subject {

    private lateinit var data: Data
    private val observers: MutableList<Observer> = mutableListOf()

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        observers.remove(o)
    }

    override fun notifyObservers() {
        observers.forEach {
            it.update(data)
        }
    }

    fun setMeasurement(data: Data) {
        this.data = data
        notifyObservers()
    }
}