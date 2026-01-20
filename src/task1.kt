class GameCharacter(val name: String) {
    var health: Int = 100
        //написать приватный сеттер который проверит что устанавливаемое значение больше 0 и меньше 100

    val isAlive: Boolean
        get() = true//реализовать кастомный геттер, что персонаж живой

    fun takeDamage(damage: Int) {
        //написать функцию получения урона с использованием приватного сеттера
        }

    fun heal(amount: Int) {
        //функция восстановления здоровья аналогичная получению урона
    }

    private fun printStatus() {
        //вывод статуса по здоровью и жив ли
    }
}

fun main() {
    val hero = GameCharacter("Рыцарь")
    // hero.health = 50 // Ошибка! Сеттер приватный

    hero.takeDamage(30)  // Здоровье: 70
    hero.heal(50)     // Здоровье: 100 (не может быть > 100)
    hero.takeDamage(120) // Здоровье: 0 (не может быть < 0)
}
