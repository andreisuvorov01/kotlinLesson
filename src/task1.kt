fun getUserName(name: String?): Int? {
    // Здесь должна быть безопасная проверка и возврат длины имени
    return name.length // Ошибка: прямое обращение к length у nullable типа
}

fun main() {
    println(getUserName("Anna")) // Должно вывести: 4
    println(getUserName(null))   // Должно вывести: null

}