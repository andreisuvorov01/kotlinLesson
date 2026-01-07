/*
   мы безопасно вызываем все параметры класса и выполняем вывод если они не равны нулю,
   иначе используем оператор элвиса для вывода нулевой ошибки
 */

class AddressAnswer(val city: String?)
class UserAnswer(val address: AddressAnswer?)

fun printUserCityAnswer(user: UserAnswer?) {
    user?.address?.city?.let { //Выполняется только при условии, что все вызовы ?. сработали
        println("City: $it") // выводит текущий элемент (it)
    } ?: println("City unknown") // срабатывает только если какой-то из предыдущих вызовов вернул null
}

fun main(){
    printUserCityAnswer(UserAnswer(AddressAnswer("Saint Petersburg")))
    printUserCityAnswer(UserAnswer(AddressAnswer(null)))
    printUserCityAnswer(UserAnswer(null))
    printUserCityAnswer(null)
}
