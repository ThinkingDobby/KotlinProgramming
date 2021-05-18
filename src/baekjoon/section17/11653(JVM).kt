package baekjoon.section17

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt()

    for (i in 2..n) {
        while (true) {
            if (n % i != 0) break
            else {
                n /= i
                bw.write("$i\n")
            }
        }
    }

    bw.flush()
    bw.close()
}