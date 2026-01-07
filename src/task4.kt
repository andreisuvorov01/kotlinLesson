/*
Перепиши функцию с использованием let, чтобы избежать вложенных if-проверок.
 */

fun processOrder(orderId: String?)  {
    orderId?.let{
        println("Processing order: $orderId")
    }
}

fun main() {
    processOrder("12345")
    processOrder(null)
    processOrder("")
}