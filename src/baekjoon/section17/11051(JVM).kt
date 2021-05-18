package baekjoon.section17
// BigInteger
import java.io.*
import java.math.BigInteger
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())

    val n = st.nextToken().toBigInteger()
    val k = st.nextToken().toBigInteger()

    val ans = fac(n) / (fac(k) * fac(n - k))

    bw.write("${ans % 10007.toBigInteger()}")

    bw.flush()
    bw.close()
}

fun fac(n: BigInteger, a: BigInteger = BigInteger.ONE): BigInteger {
    return if (n == BigInteger.ZERO) a else fac(n - BigInteger.ONE, n * a)
}