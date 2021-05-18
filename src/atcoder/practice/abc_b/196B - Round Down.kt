package atcoder.practice.abc_b

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val x = br.readLine().toBigDecimal()

    bw.write("${x.toBigInteger()}")

    bw.flush()
    bw.close()
}