/*
Перепиши функцию с использованием let, чтобы избежать вложенных if-проверок.
 */

fun processOrder(orderId: String?, callback: (String) -> Unit) {
    if (orderId != null) {
        if (orderId.isNotBlank()) {
            callback("Processing order: $orderId")
        }
    }
}

fun main() {
    processOrder("12345") { msg -> println(msg) }
    processOrder(null) { msg -> println(msg) }
    processOrder("") { msg -> println(msg) }
}