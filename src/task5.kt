/*
Перепиши функцию, используя безопасный вызов и let, чтобы убрать вложенные if.
 */

fun sendEmail(email: String?) {
    if (email != null) {
        if (email.contains("@")) {
            if (email.isNotBlank()) {
                println("Sending email to: $email")
            }
        }
    }
}

fun main(){
    sendEmail("asdfg@mail.ru")
    sendEmail("asdfgmail.ru")
    sendEmail("")
    sendEmail(null)
}