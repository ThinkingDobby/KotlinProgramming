package chap02.section2

fun main() {
    val ch = 'A'
    println(ch + 1)
                            //처음부터 숫자로 선언하는 것은 불가능
    val code = 65
    val chFromCode: Char = code.toChar()
    println(chFromCode)
}