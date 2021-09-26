package algorithm

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    // example
    val n = br.readLine().toInt()
    bw.write("${getPrimes(n)}")

    bw.flush()
    bw.close()
}

private fun getPrimes(n: Int): MutableList<Int> {
    val check = Array(n + 1) { true }
    val primes = mutableListOf<Int>()

    check[0] = false
    check[1] = false

    for (i in 2..n) {
        if (check[i]) {
            primes.add(i)
            for (j in 2 * i..n step i) check[j] = false
        }
    }

    return primes
}