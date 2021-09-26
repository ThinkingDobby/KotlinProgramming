package codeforces.practice.year21.sep.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val a = br.readLine().split(" ").map { it.toInt() }
    val m = br.readLine().toInt()
    val b = br.readLine().split(" ").map { it.toInt() }

    a@for (i in a) {
        for (j in b) {
            if (i + j !in a && i + j !in b) {
                bw.write("$i $j")
                break@a
            }
        }
    }

    bw.flush()
    bw.close()
}
