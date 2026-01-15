//// Есть класс BankAccount
//class BankAccount {
//    var balance: Double = 0.0
//
//    fun deposit(amount: Double) {
//        balance += amount
//    }
//
//    fun getBalance(): Double {
//        return balance
//    }
//}
//
//// В основном коде
//fun main() {
//    val account = BankAccount()
//    account.deposit(100.0)
//
//    // Проблема: можно напрямую изменить баланс
//    account.balance = 1000000.0 // ⚠️ Не должно быть возможным!
//
//    println("Баланс: ${account.getBalance()}")
//}