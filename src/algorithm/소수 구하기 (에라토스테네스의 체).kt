package algorithm

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    // example
    val n = br.readLine().toInt()
    era(n).forEachIndexed { idx: Int, value: Boolean ->
        if (value) bw.write("$idx ")
    }

    bw.flush()
    bw.close()
}

fun era(n: Int): Array<Boolean> {
    val primeNumbers = Array(n + 1) { true }
    primeNumbers[0] = false
    primeNumbers[1] = false

    for (i in 2..n) {
        if (primeNumbers[i]) {
            for (j in 2 * i..n step i) primeNumbers[j] = false
        }
    }

    return primeNumbers
}