package algorithm

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine().toInt()
    bw.write("${fac(input)}")

    bw.flush()
    bw.close()
}

private fun fac(a: Int, b: Int = 1): Int {
    return if (a == 1) b else fac(a - 1, a * b)
}