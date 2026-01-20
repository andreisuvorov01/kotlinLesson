// Enum — это способ определить фиксированный набор констант.
// Здесь мы описываем каждый тип кофе и его "рецепт".
enum class CoffeeType(val waterNeeded: Int, val beansNeeded: Int) {
    ESPRESSO(30, 8),
    AMERICANO(100, 8),
    LATTE(40, 10) // Для простоты молоко не учитываем
}
class CoffeeMachine(
    initialWater: Int,
    initialBeans: Int
) {
    var waterLevel: Int = initialWater
        private set
    var beansLevel: Int = initialBeans
        private set
    // Флаг, который показывает, занята ли машина приготовлением.
    private var isBusy: Boolean = false

    // --- 3. ГЛАВНЫЙ ПУБЛИЧНЫЙ МЕТОД ---
    // Это основная команда, которую видит пользователь.
    fun makeCoffee(type: CoffeeType) {
        println("-> Получена команда: приготовить ${type.name}")

        // ПРОВЕРКА УСЛОВИЙ (Guard Clause)
        // Сначала проверяем, можем ли мы вообще выполнить команду.
        if (!canMake(type)) {
            println("--- Приготовление отменено ---")
            return // Выходим из метода, если условия не выполнены
        }

        // Если все в порядке, запускаем "процесс" приготовления.
        _brew(type)
    }

    fun refillWater() {
        println("Пополнение запаса воды...")
        waterLevel = 200 // Условно максимальный бак
    }

    fun refillBeans() {
        println("Пополнение запаса зерен...")
        beansLevel = 50
    }

    fun showStatus() {
        println("[СТАТУС] Вода: $waterLevel мл, Зерна: $beansLevel г. ${if (isBusy) "ЗАНЯТА" else "ГОТОВА"}")
    }

    // --- 4. ПРИВАТНЫЕ МЕТОДЫ (ВНУТРЕННЯЯ ЛОГИКА) ---

    // Проверяет, свободна ли машина и достаточно ли ресурсов.
    private fun canMake(type: CoffeeType): Boolean {
        if (isBusy) {
            println("Ошибка: Машина уже готовит другой кофе.")
            return false
        }
        if (waterLevel < type.waterNeeded) {
            println("Ошибка: Недостаточно воды для ${type.name}.")
            return false
        }
        if (beansLevel < type.beansNeeded) {
            println("Ошибка: Недостаточно кофейных зерен для ${type.name}.")
            return false
        }
        return true
    }

    // Имитирует процесс приготовления и расходует ресурсы.
    private fun _brew(type: CoffeeType) {
        isBusy = true
        println("Начинаем готовить ${type.name}... (нужно ${type.waterNeeded} мл воды, ${type.beansNeeded} г зерен)")
        showStatus()

        // Расходуем ресурсы
        waterLevel -= type.waterNeeded
        beansLevel -= type.beansNeeded

        Thread.sleep(2000) // Имитация долгого процесса приготовления (2 секунды)

        println("Ваш ${type.name} готов!")
        isBusy = false
        showStatus()
    }
}


fun main() {
    // Создаем машину с начальными запасами
    val myMachine = CoffeeMachine(150, 40)
    myMachine.showStatus()
    println()

    // Делаем Американо
    myMachine.makeCoffee(CoffeeType.AMERICANO)
    println()

    // Пытаемся сделать еще один, пока первый не готов (не сработает, если убрать sleep)
    // myMachine.makeCoffee(CoffeeType.ESPRESSO)

    // Делаем Латте
    myMachine.makeCoffee(CoffeeType.LATTE)
    println()

    // Пытаемся сделать еще один Американо - воды не хватит
    myMachine.makeCoffee(CoffeeType.AMERICANO)
    println()

    // Пополняем запасы
    myMachine.refillWater()
    myMachine.refillBeans()
    myMachine.showStatus()
    println()

    // Теперь мы снова можем приготовить Американо
    myMachine.makeCoffee(CoffeeType.AMERICANO)
}
