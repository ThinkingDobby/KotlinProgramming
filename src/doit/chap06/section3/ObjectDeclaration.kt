package chap06.section3

object OCustomer {      // 객체 생성 없이 사용 가능
    var name = "Kildong"
    fun greeting() = println("Hello World!")
    val HOBBY = Hobby("BasketBall")

    init {
        println("Init")
    }
}

class CCustomer {
    companion object {
        const val HELLO = "hello"
        var name = "JooSol"

        @JvmField
        val HOBBY = Hobby("Football")

        @JvmStatic
        fun greeting() = println("Hello World")
    }
}

class Hobby(val name: String)

fun main() {
    OCustomer.greeting()
    OCustomer.name = "Dooly"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)

    CCustomer.greeting()
    println("name = ${CCustomer.name}, HELLO = ${CCustomer.HELLO}")
    println(CCustomer.HOBBY.name)
}