


//class Address(val city: String?)
//class User(val address: Address?)

fun getUserCity(user: User?): String? {
    return user?.address?.city

}

fun main() {
    val user1 = User(Address("Moscow"))
    val user2 = User(null)
    val user3: User? = null

    println(getUserCity(user1))
    println(getUserCity(user2))
    println(getUserCity(user3))
}