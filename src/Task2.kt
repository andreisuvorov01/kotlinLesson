// Баг в системе управления скидками
class DiscountManager {
    // Проблема: скидка может быть любой, даже отрицательной или больше 100%
    var discountPercentage = 0.0

    fun applyDiscount(price: Double): Double {
        return price * (1 - discountPercentage / 100)
    }
}

fun main() {
    val manager = DiscountManager()
    manager.discountPercentage = 150.0 // ⚠️ Баг! Скидка 150% - товар будут отдавать даром
    manager.discountPercentage = -50.0 // ⚠️ Баг! Отрицательная скидка - цена увеличится

    println("Цена со скидкой: ${manager.applyDiscount(100.0)}")
}