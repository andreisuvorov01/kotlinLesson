/*
Используй безопасные вызовы для обработки цепочки nullable объектов.
 */

class Address(val city: String?)
class User(val address: Address?)

fun printUserCity(user: User?) {
    if (user != null) {
        val address = user.address
        if (address != null) {
            val city = address.city
            if (city != null) {
                println("City: $city")
            } else {
                println("City unknown")
            }
        } else {
            println("No address")
        }
    } else {
        println("No user")
    }
}

fun main(){
    printUserCity(User(Address("Saint Petersburg")))
    printUserCity(User(Address(null)))
    printUserCity(User(null))
    printUserCity(null)
}