package chap03.section5

import java.math.BigInteger

fun main() {
    val num = 100
    val first = BigInteger("0")
    val second = BigInteger("1")
    val result = fibonacci(num, first, second)

    println(result)
}

fun fibonacci(cnt: Int, a: BigInteger, b: BigInteger): BigInteger = if (cnt == 0) a  else fibonacci(cnt-1,b,a+b)