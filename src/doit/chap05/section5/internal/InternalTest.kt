package chap05.section5.internal

internal class InternalClass {
    internal var i = 1
    internal fun icFunc(): Int {
        i += 1
        return i
    }

    fun access() {
        icFunc()
    }
}

class Other {
    internal val ic = InternalClass()
    fun test() {
        ic.i
        ic.icFunc()
    }
}

fun main() {
    val mic = InternalClass()
    mic.i
    val result = mic.icFunc()
    println("result: $result")
}