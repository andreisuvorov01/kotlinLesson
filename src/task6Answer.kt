fun getLengthOrZeroAnswer(str: String?): Int {
    return str?.let {
        if (it.isNotEmpty()) it.length else 0
    } ?: 0
}

fun main(){
    println(getLengthOrZeroAnswer("answer"))
    println(getLengthOrZeroAnswer(null))
}