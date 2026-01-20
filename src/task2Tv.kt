class TV(val brand: String) {

    // --- 1. ГРОМКОСТЬ ---
    // Громкость не может быть < 0 или > 50.
    // Сеттер сам позаботится об этом.
    var volume: Int = 10
      //добавить сеттер, который ограничивал бы значение громкости и не работал при выключенном тв
      //можно ограничить на 50, и использовать coerceIn, который не устанавливает значения выше указанного диапозона

    // --- 2. КАНАЛ ---
    var channel: Int = 1
        //как запретить устанавливать значение простым вызовом

    // 3. СОСТОЯНИЕ ПИТАНИЯ
    var isOn: Boolean = false
        //как запретить устанавливать значение простым вызовом

    //4. МЕТОДЫ УПРАВЛЕНИЯ

    fun turnOn() {
        //функцию перевода состояния телевизора во включенный
    }

    fun turnOff() {
        //функцию перевода состояния телевизора в выключенный
    }

    fun nextChannel() {
        //функция переключения канала на следующий(то есть выше по значению)
    }

    fun prevChannel() {
        //функция переключения канала на предыдущий(то есть ниже по значению)
    }

    fun showStatus() {
        //вывод состояния: вклчючен ли, какой канал и громкость
    }
}


fun main() {
    // Создаем наш телевизор
    val livingRoomTV = TV("Samsung")
    livingRoomTV.showStatus()

    // Пытаемся прибавить громкость на выключенном ТВ
    livingRoomTV.volume++ // Выведет "Сначала включите телевизор!"
    println()

    // Включаем его
    livingRoomTV.turnOn()
    livingRoomTV.showStatus()
    println()

    // Переключаем каналы
    livingRoomTV.nextChannel() // Канал 2
    livingRoomTV.nextChannel() // Канал 3
    println()

    // Регулируем громкость
    livingRoomTV.volume = 48
    livingRoomTV.volume++     // Громкость: 49
    livingRoomTV.volume++     // Громкость: 50
    livingRoomTV.volume++     // Громкость всё ещё 50
    println()

    // Выключаем
    livingRoomTV.turnOff()
    livingRoomTV.showStatus()
}
