package chap05.section5.privatetest

private class PrivateClass {
    private var i = 1       // private 멤버는 해당 클래스 내에서만 사용 가능
    private fun privateFunc() {
        i += 1      // 해당 클래스 내부에서는 참조 가능
    }

    fun access() {
        privateFunc()
        println("i: $i")
    }
}

class OtherClass {
    //val opc = PrivateClass()      // 프로퍼티로서 객체 생성 불가 - 똑같이 private로 선언해야
    fun test() {
        val pc = PrivateClass()     // 일반 객체는 생성 가능
    }
}

fun main() {
    val pc = PrivateClass()
    pc.access()
    //pc.i      // 객체 생성했더라도 PrivateClass 내 i, privateFunc()가 private이므로 접근 불가
    //pc.privateFunc()
}

fun TopFunction() {
    val tpc = PrivateClass()
}