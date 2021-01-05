package chap06.section3

open class Superman {
    fun work() = println("Taking photos")
    fun talk() = println("Talking with people.")
    open fun fly() = println("Flying in the air.")
}

fun main() {
    val pretendedMan = object : Superman() {
        override fun fly() = println("I'm not a real Superman.")    // 하위 클래스 생성 없이 특정 메서드 오버라이딩 가능
    }
    pretendedMan.work()
    pretendedMan.talk()
    pretendedMan.fly()
}