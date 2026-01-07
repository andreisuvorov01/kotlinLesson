/*
Напиши функцию getPriceWithDiscount, которая принимает nullable цену и nullable скидку.
 Если цена null, верни 0.0. Если скидка null, верни полную цену. Иначе примени скидку.
 */

fun getPriceWithDiscount(price: Double?, discount: Double?): Double {
    TODO()
}

fun main() {
    println(getPriceWithDiscount(100.0, 10.0))
    println(getPriceWithDiscount(100.0, null))
    println(getPriceWithDiscount(null, 10.0))
}