fun getUserName(name: String?): Int? {
    return name?.length
}

fun main() {
    println(getUserName("Anna"))
    println(getUserName(null))

}