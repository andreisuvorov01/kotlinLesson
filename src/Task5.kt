class User {
    // Проблема: пароль хранится в открытом виде
    var password = ""

    var age = 0
        // Проблема: сеттер публичный без проверки
        set(value) {
            field = value
        }
}

fun main() {
    val user = User()

    // ⚠️ Баги безопасности:
    user.password = "123456" // Пароль можно легко прочитать
    user.age = -5 // Возраст может быть отрицательным

    println("Пароль: ${user.password}") // Выводит пароль в лог!
}