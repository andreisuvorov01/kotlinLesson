open class Vehicle {
    // Проблема: пробег можно изменять откуда угодно
    var mileage = 0

    fun drive(distance: Int) {
        mileage += distance
    }
}

class Car : Vehicle() {
    fun resetMileageForTest() {
        mileage = 0 // Должно быть доступно только внутри иерархии классов
    }
}

fun main() {
    val car = Car()
    car.drive(100)

    // ⚠️ Проблема: кто угодно может сбросить пробег
    car.mileage = 0
}