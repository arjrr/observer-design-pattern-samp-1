## Observer (_Design Pattern_)
Exemplo de implementação básica do padrão de projeto _Observer_.

Linguagem: Kotlin

## Definição

Segundo Freeman e Freeman (2004):

"**O padrão Observer:** Define a dependência um-para-muitos entre objetos para que quando um objeto mude de estado todos os seus dependentes sejam avisados e atualizados automaticamente."

## O poder da ligação leve

Para Freeman e Freeman (2004), "o padrão Observer fornece um design de objeto onde os sujeitos e os observador são levemente ligados."

Por quê?

> "A única coisa que o sujeito sabe sobre um observador é que ele implementa uma certa interface"

> "Podemos adicionar novos observadores a qualquer momento"

> "Nunca precisamos modificar o sujeito para adicionar novos tipos de observadores"

> "Podemos reutilizar sujeitos ou observadores independentemente uns dos outros"

> "Alterações no sujeito ou num observador não irão afetar o outro"

## Implementação

**Observer implementation**

```kotlin
class Display : Observer {
    override fun update(data: Data) {
        println("Temperature: ${data.temperature}, Humidity: ${data.humidity}")
    }
}
```

**Subject implementation**

```kotlin
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
```

**Main**

```kotlin
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
```
