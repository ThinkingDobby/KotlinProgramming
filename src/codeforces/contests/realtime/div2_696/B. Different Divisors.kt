package codeforces.contests.realtime.div2_696

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val primeNumbers = Array(1000001){true}
    primeNumbers[0] = false
    primeNumbers[1] = false
    for (i in 2..500000) {
        for (j in 2..500000) {
            if (i * j > 1000000) break
            else primeNumbers[i * j] = false
        }
    }

    val t = br.readLine().toInt()
    repeat(t) {
        val d = br.readLine().toInt()

        var tmp = 0
        for (i in 1 + d until 1000001) {
            if (primeNumbers[i]) {
                tmp = i
                break
            }
        }

        for (i in tmp + d until 1000001) {
            if (primeNumbers[i]) {
                bw.write("${tmp * i}")
                break
            }
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}