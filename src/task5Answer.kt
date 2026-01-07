fun sendEmailAnswer(email: String?) {
    email?.let {
        if (it.contains("@") && it.isNotBlank()) {
            println("Sending email to: $it")
        }
    }
}

fun main(){
    sendEmailAnswer("asdfg@mail.ru")
    sendEmailAnswer("asdfgmail.ru")//не содержит @
    sendEmailAnswer("")// пустое значение отбрасывается isNotBlank()
    sendEmailAnswer(null)// не выполняется потому что let не вызывается после ?.
}