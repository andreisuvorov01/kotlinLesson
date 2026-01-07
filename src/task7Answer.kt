/*
   мы безопасно вызываем все параметры класса и выполняем вывод если они не равны нулю,
   иначе используем оператор элвиса для вывода нулевой ошибки
 */

class AddressAnswer(val city: String?)
class UserAnswer(val address: AddressAnswer?)

fun printUserCityAnswer(user: UserAnswer?) {
    user?.address?.city?.let {
        println("City: $it")
    } ?: println("City unknown")
}

fun main(){
    printUserCityAnswer(UserAnswer(AddressAnswer("Saint Petersburg")))
    printUserCityAnswer(UserAnswer(AddressAnswer(null)))
    printUserCityAnswer(UserAnswer(null))
    printUserCityAnswer(null)
}
