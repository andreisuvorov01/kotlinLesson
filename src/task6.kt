/*
Напиши функцию с использованием let и ?.,
 которая возвращает длину строки или 0, если строка null или пустая.
 */

fun getLengthOrZero(str: String?): Int {
    if (str == null) return 0
    if (str.isEmpty()) return 0
    return str.length
}

fun main(){
    getLengthOrZero("answer")
    getLengthOrZero(null)
}