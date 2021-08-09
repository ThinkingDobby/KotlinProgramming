package algorithm

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    bw.write("${getDivisors(n)}")

    bw.flush()
    bw.close()
}

private fun getDivisors(n: Int): MutableList<Int> {
    var i = 1
    val divisorList = mutableListOf<Int>()

    while (i * i <= n) {
        if (n % i == 0) {
            divisorList.add(i)
            divisorList.add(n / i)
        }
        i++
    }

    divisorList.sort()
    return divisorList
}