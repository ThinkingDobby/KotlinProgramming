package chap07.section2

data class Customer(val name: String, val email: String)

fun main() {
    val cus1 = Customer("Sean", "sean@mail.com")
    val cus2 = Customer("Sean", "sean@mail.com")
    val bob = Customer("Bob", "bob@mail.com")
    val erica = Customer("Erica", "erica@mail.com")

    val customers = listOf(cus1, cus2, bob, erica)

    for ((name, email) in customers) {
        println("name = $name, email = $email")
    }
}