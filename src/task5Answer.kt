fun sendEmailAnswer(email: String?) {
    email?.let {
        if (it.contains("@") && it.isNotBlank()) {
            println("Sending email to: $it")
        }
    }
}

fun main(){
    sendEmailAnswer("asdfg@mail.ru")
    sendEmailAnswer("asdfgmail.ru")
    sendEmailAnswer("")
    sendEmailAnswer(null)
}